package com.github.houbb.rpc.common.support.inteceptor;

/**
 * rpc 拦截器
 *
 * 【调用示意流程】
 *
 * <pre>
 *
 * remoteCall() {
 *
 *     try() {
 *          before();
 *
 *         //.... 原来的调用逻辑
 *
 *         after();
 *     } catch(Ex ex) {
 *         ex();
 *     }
 *
 * }
 * </pre>
 *
 * 【拦截器 chain】
 * 将多个拦截器视为一个拦截器。
 * 保证接口的纯粹与统一。
 *
 * @author binbin.hou
 * @since 0.1.4
 */
public interface Interceptor {

    /**
     * 开始
     * @param context 上下文
     * @since 0.1.4
     */
    void before(final InterceptorContext context);

    /**
     * 结束
     * @param context 上下文
     * @since 0.1.4
     */
    void after(final InterceptorContext context);

    /**
     * 异常处理
     * @param context 上下文
     * @since 0.1.4
     */
    void exception(final InterceptorContext context);

}
