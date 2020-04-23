package com.dlc.flyweight;

public class TestInteger {
    public static void main(String[] args) {
        Integer x = Integer.valueOf(16);
        Integer y = Integer.valueOf(16);
        System.out.println(x==y);   //true
    }
}
