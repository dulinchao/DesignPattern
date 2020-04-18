package com.dlc.adapter.objectadapter;

public class Adapter implements IVol5 {
    private Vol220 vol220;  //聚合关系

    public Adapter(Vol220 vol220) {
        this.vol220 = vol220;
    }

    public int output5V() {
        int srcV = vol220.output220V();
        int dstV = srcV/44; //220V转为5V
        return dstV;
    }
}
