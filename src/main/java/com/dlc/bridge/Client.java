package com.dlc.bridge;

import java.sql.Driver;

public class Client {
    public static void main(String[] args) {
        Phone phone1 = new FoldPhone(new Xiaomi());
        phone1.open();
        phone1.call();
        phone1.close();
        Phone phone2 = new FoldPhone(new Vivo());
        phone2.open();
        phone2.call();
        phone2.close();
    }
}
