package com.dlc.command;

public class RemoteController {
    Command[] onCommands;
    Command[] offCommands;

    Command undoCommand;    //撤销命令
    //初始化按钮，并设置空命令
    public RemoteController(){
        onCommands = new Command[5];
        offCommands = new Command[5];
        for(int i=0;i<5;i++){
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }
    //为按钮设置命令
    public void setCommond(int no,Command onCommand,Command offCommand){
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }
    //按下开按钮
    public void onButtonPushed(int no){
        onCommands[no].execute();
        //记录一下这次操作，用于撤销
        undoCommand = onCommands[no];
    }
    //按下关按钮
    public void offButtonPushed(int no){
        offCommands[no].execute();
        //记录一下这次操作，用于撤销
        undoCommand = offCommands[no];
    }
    //按下撤销按钮
    public void undoButtonPushed(){
        undoCommand.undo();
    }
}
