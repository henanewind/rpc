package com.github.houbb.rpc.common.exception;

/**
 * rpc 运行时异常
 * @author binbin.hou
 * @since 0.0.6
 */
public class RpcRuntimeException extends RuntimeException{

    public RpcRuntimeException() {
    }

    public RpcRuntimeException(String message) {
        super(message);
    }

    public RpcRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public RpcRuntimeException(Throwable cause) {
        super(cause);
    }

    public RpcRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
