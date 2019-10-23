/*
 * Copyright (c)  2019. houbinbin Inc.
 * rpc All rights reserved.
 */

package com.github.houbb.rpc.register.domain;

/**
 * <p> 默认服务明细 </p>
 *
 * <pre> Created: 2019/10/23 8:26 下午  </pre>
 * <pre> Project: rpc  </pre>
 *
 * @author houbinbin
 * @since 0.0.8
 */
public class DefaultServerEntry implements ServerEntry {

    private static final long serialVersionUID = 189302740666003309L;

    /**
     * 服务标识
     * @since 0.0.8
     */
    private String serviceId;

    /**
     * 服务描述
     * @since 0.0.8
     */
    private String description;

    /**
     * 机器 ip 信息
     *
     * <pre>
     *     InetSocketAddress insocket = (InetSocketAddress) ctx.channel().remoteAddress();
     *     String clientIP = insocket.getAddress().getHostAddress();
     * </pre>
     *
     * @since 0.0.8
     */
    private String ip;

    /**
     * 端口信息
     * @since 0.0.8
     */
    private int port;

    /**
     * 权重信息
     * @since 0.0.8
     */
    private int weight;


    @Override
    public String serviceId() {
        return serviceId;
    }

    public DefaultServerEntry serviceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    @Override
    public String description() {
        return description;
    }

    public DefaultServerEntry description(String description) {
        this.description = description;
        return this;
    }

    @Override
    public String ip() {
        return ip;
    }

    public DefaultServerEntry ip(String ip) {
        this.ip = ip;
        return this;
    }

    @Override
    public int port() {
        return port;
    }

    public DefaultServerEntry port(int port) {
        this.port = port;
        return this;
    }

    @Override
    public int weight() {
        return weight;
    }

    public DefaultServerEntry weight(int weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public String toString() {
        return "DefaultServiceEntry{" +
                "serviceId='" + serviceId + '\'' +
                ", description='" + description + '\'' +
                ", ip='" + ip + '\'' +
                ", port=" + port +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DefaultServerEntry that = (DefaultServerEntry) o;

        if (port != that.port) return false;
        if (serviceId != null ? !serviceId.equals(that.serviceId) : that.serviceId != null)
            return false;
        return ip != null ? ip.equals(that.ip) : that.ip == null;
    }

    @Override
    public int hashCode() {
        int result = serviceId != null ? serviceId.hashCode() : 0;
        result = 31 * result + (ip != null ? ip.hashCode() : 0);
        result = 31 * result + port;
        return result;
    }

}
