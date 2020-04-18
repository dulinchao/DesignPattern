package com.dlc.builder.improve;

public class CommonHouseBulder extends HouseBuilder {
    public void buildBasic() {
        System.out.println("普通房子打地基");
    }
    public void buildWalls() {
        System.out.println("普通房子砌墙");
    }
    public void roofed() {
        System.out.println("普通房子盖屋顶");
    }
}
