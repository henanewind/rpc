package com.github.houbb.rpc.server.support.register;

import com.github.houbb.rpc.common.config.component.RpcAddress;
import com.github.houbb.rpc.register.domain.entry.ServiceEntry;
import io.netty.channel.Channel;

/**
 * 服务端注册中心本地管理类
 * @since 0.1.8
 */
public interface ServerRegisterManager {

    /**
     * 注册当前服务信息
     * （1）将该服务通过 {@link ServiceEntry#serviceId()} 进行分组
     * 订阅了这个 serviceId 的所有客户端
     * @param serviceEntry 注册当前服务信息
     * @since 0.0.8
     */
    void register(final ServiceEntry serviceEntry);

    /**
     * 注销当前服务信息
     * @param serviceId 服务标识
     * @since 0.0.8
     */
    ServiceEntry unRegister(final String serviceId);

    /**
     * 注销当前所有服务信息
     * @since 0.1.8
     */
    void unRegisterAll();

    /**
     * 添加注册中心的 channel
     * @param rpcAddress 地址
     * @param channel channel
     * @since 0.1.8
     */
    void addRegisterChannel(RpcAddress rpcAddress, Channel channel);

    /**
     * 移除注册中心的 channel
     * @param rpcAddress 地址
     * @since 0.1.8
     */
    void removeRegisterChannel(RpcAddress rpcAddress);

    /**
     * 清空注册中心的 channel
     * @since 0.1.8
     */
    void clearRegisterChannel();

}
