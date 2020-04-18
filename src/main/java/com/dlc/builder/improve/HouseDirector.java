package com.dlc.builder.improve;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HouseDirector {
    HouseBuilder houseBuilder = null;
    //指挥者来处理建造房子的流程，根据传入HouseBuilder的不同建造不同的房子
    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
