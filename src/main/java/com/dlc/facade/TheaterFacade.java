package com.dlc.facade;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class TheaterFacade {
    //聚合各个子系统对象
    private DVDPlayer dvdPlayer;
    private Popcorn popcorn;
    private Projector projector;
    //构造器中对对象进行初始化
    public TheaterFacade(){
        dvdPlayer = DVDPlayer.getInstance();
        popcorn = Popcorn.getInstance();
        projector = Projector.getInstance();
    }
    //操作分为四步，第一步：准备
    public void ready(){
        popcorn.on();
        dvdPlayer.on();
        projector.on();
    }
    //第二步：播放，此处只写出这两种，剩下的脑补
    public void play(){
        dvdPlayer.play();
        projector.focus();
    }
}
