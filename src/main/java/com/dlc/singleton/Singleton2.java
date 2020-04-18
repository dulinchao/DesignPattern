package com.dlc.singleton;

public class Singleton2 {
    private Singleton2(){
    }
    private static Singleton2 instance;
    //静态代码块中创建单例对象
    static {
        instance = new Singleton2();
    }
    public static Singleton2 getInstance(){
        return instance;
    }
}
