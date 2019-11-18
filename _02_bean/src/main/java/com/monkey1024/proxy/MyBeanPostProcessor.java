package com.monkey1024.proxy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by thinkpad on 2019/10/9.
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        if("studentService".equals(beanName)) {
            InvocationHandler invocationHandler = ((Object p, Method method, Object[] args) -> {
                if ("study".equals(method.getName())) {
                    System.out.println("======目标方法开始=======");
                    Object result = method.invoke(bean, args);
                    System.out.println("======目标方法结束=======");
                    return result;
                }
                return  method.invoke(bean, args);
            });

            Object proxy = Proxy.newProxyInstance(bean.getClass().getClassLoader(), bean.getClass().getInterfaces(), invocationHandler);

            System.out.println("执行before");
            return proxy;
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        System.out.println("执行after");
        return bean;
    }
}
