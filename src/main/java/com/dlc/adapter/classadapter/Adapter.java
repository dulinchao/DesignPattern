package com.dlc.adapter.classadapter;

public class Adapter extends Vol220 implements IVol5 {

    public int output5V() {
        int srcV = output220V();
        int dstV = srcV/44; //220V转为5V
        return dstV;
    }
}
