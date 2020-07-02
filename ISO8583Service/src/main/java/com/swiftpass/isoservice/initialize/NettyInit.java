package com.swiftpass.isoservice.initialize;

import com.swiftpass.isoservice.netty.GloableSocket;
import com.swiftpass.isoservice.netty.NettyLongInitializer;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * ClassName: NettyInit <br/>
 * Description: <br/>
 * date: 2020/6/30 16:15<br/>
 *
 * @author jinhui.hu<br />
 * @since JDK 1.8
 */
@Slf4j
@Component
public class NettyInit implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        log.info("NettyInit 初始化加载");
        Bootstrap bootstrap = new Bootstrap();
        EventLoopGroup eventExecutors = new NioEventLoopGroup();
        bootstrap.group(eventExecutors);
        bootstrap.channel(NioSocketChannel.class);
        bootstrap.handler(new NettyLongInitializer());
        ChannelFuture future  = bootstrap.connect("127.0.0.1",6666).addListener(new ChannelFutureListener() {
            @Override
            public void operationComplete(ChannelFuture channelFuture) throws Exception {
                if (channelFuture.isSuccess()){
                    log.info("长连接建立成功");
                    GloableSocket.longChannel = channelFuture.sync().channel();
                }else {
                    Throwable cause = channelFuture.cause();
                    cause.printStackTrace();
                }
            }
        });

    }
}
