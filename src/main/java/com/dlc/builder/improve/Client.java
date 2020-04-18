package com.dlc.builder.improve;

public class Client {

    public static void main(String[] args) {
        CommonHouseBulder commonHouseBulder = new CommonHouseBulder();
        HighBuildingBuilder highBuildingBuilder = new HighBuildingBuilder();
        HouseDirector director = new HouseDirector();

        director.setHouseBuilder(commonHouseBulder);
        House house1 = director.constructHouse();
        director.setHouseBuilder(highBuildingBuilder);
        House house2 = director.constructHouse();
    }
}
