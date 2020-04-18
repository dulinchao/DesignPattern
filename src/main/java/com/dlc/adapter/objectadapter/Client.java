package com.dlc.adapter.objectadapter;

public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charming(new Adapter(new Vol220()));
    }
}
