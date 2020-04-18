package com.dlc.singleton;


public class Singleton3 {
    private static volatile Singleton3 instance;

    private Singleton3() {
    }
    //当使用该方法时，才会创建instance
    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}
