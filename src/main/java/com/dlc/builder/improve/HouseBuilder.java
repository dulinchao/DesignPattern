package com.dlc.builder.improve;

//Builder
public abstract class HouseBuilder {
    protected House house = new House();

    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    //建好房子后，将房子返回
    public House buildHouse(){
        return house;
    }
}
