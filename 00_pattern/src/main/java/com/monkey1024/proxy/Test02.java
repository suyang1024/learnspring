package com.monkey1024.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test02 {

    public static void main(String[] args) {
        XiaoMan xiaoMan = new XiaoMan();

        Beauty proxy = (Beauty) Proxy.newProxyInstance(xiaoMan.getClass().getClassLoader(), xiaoMan.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object p, Method method, Object[] args) throws Throwable {
                Object result = null;
                if("eat".equals(method.getName())) {
                    System.out.println("吃饭之前的准备");
                    result = method.invoke(xiaoMan, args);
                    System.out.println("吃饭之后的结果");
                } else if("gift".equals(method.getName())) {
                    result = method.invoke(xiaoMan, args);
                }

                return result;
            }
        });

        You you = new You(proxy);

        you.makeFriend();
        you.show();
    }
}
