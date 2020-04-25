package com.dlc.command;

public class Client {
    public static void main(String[] args) {
        //创建电灯（命令接收者）
        LightReceiver lightReceiver = new LightReceiver();
        //创建电灯的开关命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        //新建一个遥控器
        RemoteController remoteController = new RemoteController();
        remoteController.setCommond(0,lightOnCommand,lightOffCommand);
        remoteController.onButtonPushed(0);
        remoteController.offButtonPushed(0);
    }
}
