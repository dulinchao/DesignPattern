package com.dlc.facade;

//爆米花机类
public class Popcorn {
    private final static Popcorn INSTANCE = new Popcorn();
    public static Popcorn getInstance(){
        return INSTANCE;
    }
    public void on() {
        System.out.println("爆米花机 打开");
    }
    public void close() {
        System.out.println("爆米花机 关闭");
    }
    public void pop() {
        System.out.println("爆米花机正在出爆米花");
    }
}
