package com.swiftpass.isoservice.netty;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.timeout.IdleStateHandler;

import java.util.concurrent.TimeUnit;

/**
 * ClassName: NettyLongInitializer <br/>
 * Description: <br/>
 * date: 2020/6/30 16:21<br/>
 *
 * @author jinhui.hu<br />
 * @since JDK 1.8
 */
public class NettyLongInitializer extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {
        ChannelPipeline pipeline = socketChannel.pipeline();
        pipeline.addLast(new NettyDecoder());
        //添加心跳监控
        pipeline.addLast(new IdleStateHandler(30,30,30, TimeUnit.SECONDS));

    }
}
