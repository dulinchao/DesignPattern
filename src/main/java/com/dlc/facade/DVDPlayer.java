package com.dlc.facade;

// DVD 播放器
public class DVDPlayer {
    //使用单例模式，饿汉式
    private static final DVDPlayer INSTANCE = new DVDPlayer();
    public static DVDPlayer getInstance() {
        return INSTANCE;
    }
    public void on() {
        System.out.println("DVD 打开");
    }
    public void close() {
        System.out.println("DVD 关闭");
    }
    public void play() {
        System.out.println("DVD 正在播放");
    }
    public void pause() {
        System.out.println("DVD 暂停");
    }
}
