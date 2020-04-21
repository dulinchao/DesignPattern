package com.dlc.bridge;

//扩展抽象类
public class FoldPhone extends Phone {

    public FoldPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        System.out.println("折叠手机");
        super.open();
    }

    @Override
    public void close() {
        System.out.println("折叠手机");
        super.close();
    }

    @Override
    public void call() {
        System.out.println("折叠手机");
        super.call();
    }
}
