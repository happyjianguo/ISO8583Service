package com.swiftpass.isoservice.netty;

import com.swiftpass.isoservice.utils.ISO8583Util;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import lombok.extern.slf4j.Slf4j;

/**
 * ClassName: NettyLongHandler <br/>
 * Description: <br/>
 * date: 2020/6/30 16:25<br/>
 *
 * @author jinhui.hu<br />
 * @since JDK 1.8
 */
@Slf4j
public class NettyLongHandler extends SimpleChannelInboundHandler<byte[]> {

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, byte[] data) throws Exception {
        log.info("处理接收数据{}", ISO8583Util.bytesToHexString(data));

    }
}
