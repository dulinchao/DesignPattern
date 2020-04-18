package com.dlc.principle.ocp;

public class Ocp1 {
    public static void main(String[] args) {
        new Triangle().draw();
        new Rectangle().draw();
    }
}
abstract class Shape{
    abstract void draw();
}
class Triangle extends Shape{

    @Override
    void draw() {
        System.out.println("绘制三角形");
    }
}
class Rectangle extends Shape{

    @Override
    void draw() {
        System.out.println("绘制矩形");
    }
}