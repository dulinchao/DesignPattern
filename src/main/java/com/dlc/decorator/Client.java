package com.dlc.decorator;

public class Client {
    public static void main(String[] args) {
        //下订单：两份巧克力加一份牛奶的LongBlack

        //1.点一份LongBlack
        Drink drink = new LongBlack();
        System.out.println(drink.getDescription()+" "+drink.cost());
        //2.加入一份牛奶
        drink = new Milk(drink);
        System.out.println(drink.getDescription()+" "+drink.cost());
        //3.加入两份巧克力
        drink = new Chocolate(drink);
        drink = new Chocolate(drink);
        System.out.println(drink.getDescription()+" "+drink.cost());

    }
}
