package com.swiftpass.isoservice.netty;

import com.swiftpass.isoservice.utils.ISO8583Util;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import lombok.extern.slf4j.Slf4j;
import java.util.List;

/**
 * ClassName: NettyDecoder <br/>
 * Description: <br/>
 * date: 2020/6/10 14:46<br/>
 *
 * @author jinhui.hu<br />
 * @since JDK 1.8
 */
@Slf4j
public class NettyDecoder extends ByteToMessageDecoder {

    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        System.out.println("执行自定义解码器");
        byte[] bytelen = new byte[4];
        byteBuf.readBytes(bytelen);
        String len = ISO8583Util.bytesToString(bytelen);
        if ("0000".equals(len)) {
            log.info("心跳报文 0000");
            return;
        }
        log.info("报文长度hex：" + len);
        byte[] bytebody = new byte[Integer.valueOf(len)];
        byteBuf.readBytes(bytebody);
        log.info("报文内容：" + ISO8583Util.bytesToHexString(bytebody));
        list.add(bytebody);
    }

}
