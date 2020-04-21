package com.dlc.bridge;

public class Vivo implements Brand{
    public void open() {
        System.out.println("vivo开机");
    }

    public void close() {
        System.out.println("vivo关机");
    }

    public void call() {
        System.out.println("vivo打电话");
    }
}
