package com.dlc.prototype;

public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom",1,"白色");
        sheep.setFriend(new Sheep("jack",2,"黑色"));
        Sheep sheep2 = null;
        try {
            sheep2 = (Sheep) sheep.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(sheep2.getFriend()==sheep.getFriend());
    }
}
