package com.dlc.facade;

public class Screen {
    private final static Screen INSTANCE = new Screen();
    public static Screen getInstance(){
        return INSTANCE;
    }
    public void up() {
        System.out.println("屏幕上升");
    }
    public void down() {
        System.out.println("屏幕下降");
    }
}
