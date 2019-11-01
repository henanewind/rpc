package com.github.houbb.rpc.common.config.application.impl;

import com.github.houbb.rpc.common.config.application.ApplicationConfig;

/**
 * 应用配置信息
 * （1）服务的应用应该是一个单例。
 * （2）对于用户可以不可见，直接根据 rpc.properties 设置。
 * @author binbin.hou
 * @since 0.0.6
 */
public class DefaultApplicationConfig implements ApplicationConfig {

    /**
     * 应用名称
     * @since 0.0.6
     */
    private String name;

    /**
     * 环境名称
     * dev test pre_prod prod
     * @since 0.0.6
     */
    private String env;

    @Override
    public String name() {
        return name;
    }

    public DefaultApplicationConfig name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String env() {
        return env;
    }

    public DefaultApplicationConfig env(String env) {
        this.env = env;
        return this;
    }

    @Override
    public String toString() {
        return "ApplicationConfig{" +
                "name='" + name + '\'' +
                ", env='" + env + '\'' +
                '}';
    }
}
