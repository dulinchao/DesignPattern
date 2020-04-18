package com.dlc.adapter.classadapter;

public class Phone {
    //充电
    public void charming(IVol5 iVol5){
        if(iVol5.output5V()==5){
            System.out.println("充电正常");
        }else {
            System.out.println("电压不合适");
        }
    }
}
