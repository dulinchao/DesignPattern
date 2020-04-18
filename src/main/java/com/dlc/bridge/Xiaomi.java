package com.dlc.bridge;

public class Xiaomi implements Brand{
    public void open() {
        System.out.println("小米开机");
    }

    public void close() {
        System.out.println("小米关机");
    }

    public void call() {
        System.out.println("小米打电话");
    }
}
