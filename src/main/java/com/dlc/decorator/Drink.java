package com.dlc.decorator;

import lombok.Data;

@Data
public abstract class Drink {
    private String description;
    private float price = 0.0f;

    //计算费用
    public abstract float cost();
}
