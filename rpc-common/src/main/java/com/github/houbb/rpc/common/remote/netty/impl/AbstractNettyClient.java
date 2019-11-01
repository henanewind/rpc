package com.github.houbb.rpc.common.remote.netty.impl;

import com.github.houbb.rpc.common.remote.netty.NettyClient;
import io.netty.channel.ChannelHandler;

/**
 * netty 网络服务端
 * @author binbin.hou
 * @since 0.0.8
 * @param <V> 泛型
 */
public abstract class AbstractNettyClient<V> implements NettyClient<V> {

    /**
     * ip 信息
     * @since 0.0.8
     */
    protected String ip;

    /**
     * 端口信息
     * @since 0.0.8
     */
    protected int port;

    /**
     * channel handler
     * @since 0.0.8
     */
    protected ChannelHandler channelHandler;

    public AbstractNettyClient(String ip, int port, ChannelHandler channelHandler) {
        this.ip = ip;
        this.port = port;
        this.channelHandler = channelHandler;
    }

    @Override
    public void init() {

    }

    @Override
    public void destroy() {

    }

}
