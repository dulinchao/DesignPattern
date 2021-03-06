package com.dlc.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    //维护一个目标对象
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }
    //给目标对象生成代理对象
    public Object getProxyInstance(){
        //1.ClassLoader loader指定当前目标对象使用的类加载器
        //2.Class<?>[] interfaces 目标对象实现的接口类型，使用泛型的方式确认类型
        //3.InvocationHandler h 事件处理，执行目标对象的方法，会触发事件处理器方法
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("JDK代理开始");
                        //使用反射机制调用目标对象方法
                        Object returnVal = method.invoke(target, args);
                        return returnVal;
                    }
                });
    }
}
