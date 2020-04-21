package com.dlc.decorator;

public class Decorator extends Drink {
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    public float cost() {
        //super.getPrice()是调料自己的价格,drink.cost()是装饰的咖啡的价格
        return super.getPrice()+drink.cost();
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" "+super.getPrice()+ "&&"+drink.getDescription();
    }
}
