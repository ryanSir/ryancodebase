package com.ryan.codebase.design.pattern.structural.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @author Ryan
 * @version Id: UserDao, v 0.1 2020/11/20 上午11:12 ryan Exp $
 */
public class UserDao {

    void save() {
        System.out.println("save");
    }

    public static void main(String[] args) {
        UserDao target = new UserDao();
        UserDao proxy = (UserDao) new Proxy(target).getInstanceProxy();
        proxy.save();
    }

    private static class Proxy implements MethodInterceptor {
        private Object proxy;

        public Proxy(Object proxy) {
            this.proxy = proxy;
        }

        public Object getInstanceProxy() {
            Enhancer en = new Enhancer();
            en.setSuperclass(proxy.getClass());
            en.setCallback(this);
            return en.create();

        }

        public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
            System.out.println("before");
            method.invoke(proxy, objects);
            System.out.println("after");
            return null;
        }
    }
}

