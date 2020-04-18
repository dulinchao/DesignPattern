package com.dlc.adapter.interfaceadapter;

public class Client {
    public static void main(String[] args) {
        AbsAdapter adapter = new AbsAdapter() {
            @Override
            public void m1() {
                System.out.println("使用m1");
            }
        };
        adapter.m1();
    }
}
