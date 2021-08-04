package com.ryan.codebase.design.pattern.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Ryan
 * @version Id: ProxyFactory, v 0.1 2020/11/20 上午10:47 ryan Exp $
 */
public class ProxyFactory {

    private MetricsRecord metricsRecord = new IMetricsRecord();

    public Object createProxy(Object o) {
        Class<?>[] interfaces = o.getClass().getInterfaces();
        DynamicProxyHandler handle = new DynamicProxyHandler(o);
        return Proxy.newProxyInstance(o.getClass().getClassLoader(), interfaces, handle);
    }

    private class DynamicProxyHandler implements InvocationHandler {

        private Object proxy;

        public DynamicProxyHandler(Object o) {
            this.proxy = o;
        }

        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            Object o = method.invoke(this.proxy, args);
            metricsRecord.record();
            System.out.println(args[0]);
            return o;
        }
    }

    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        UserService userService = (UserService) proxyFactory.createProxy(new IUserService());
        userService.login("a");
    }
}
