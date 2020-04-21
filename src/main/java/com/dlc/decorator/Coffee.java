package com.dlc.decorator;

public class Coffee extends Drink{
    public float cost() {
        return super.getPrice();
    }
}
