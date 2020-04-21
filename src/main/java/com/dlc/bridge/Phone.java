package com.dlc.bridge;

//抽象类
public abstract class Phone {
    private Brand brand;
    public Phone(Brand brand) {
        this.brand = brand;
    }
    public void open(){
        //不用去管具体实现，只需要按照传入的brand执行方法即可
        brand.open();
    }
    public void close(){
        brand.close();
    }
    public void call(){
        brand.call();
    }
}

