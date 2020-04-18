package com.dlc.singleton;

public class Singleton1 {
    //1.构造器私有化
    private Singleton1(){
    }
    //2.内部创建对象实例
    private final static Singleton1 instance = new Singleton1();
    //3.提供一个公有的静态方法，返回实例对象
    public static Singleton1 getInstance(){
        return instance;
    }
}
