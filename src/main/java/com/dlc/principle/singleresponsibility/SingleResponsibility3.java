package com.dlc.principle.singleresponsibility;

public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle = new Vehicle2();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.fly("飞机");
    }
}

//交通工具类
class Vehicle2 {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上跑");
    }

    public void fly(String vehicle) {
        System.out.println(vehicle + "在天上飞");
    }

    public void swim(String vehicle) {
        System.out.println(vehicle + "在水里游");
    }
}