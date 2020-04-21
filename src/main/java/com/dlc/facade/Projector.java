package com.dlc.facade;

public class Projector {
    private final static Projector INSTANCE = new Projector();
    public static Projector getInstance(){
        return INSTANCE;
    }
    public void on() {
        System.out.println("投影仪 打开");
    }
    public void close() {
        System.out.println("投影仪 关闭");
    }
    public void focus() {
        System.out.println("投影仪正在投影");
    }
}
