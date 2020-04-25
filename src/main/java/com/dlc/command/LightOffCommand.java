package com.dlc.command;

public class LightOffCommand implements Command{
    LightReceiver light;

    public LightOffCommand(LightReceiver light) {
        this.light = light;
    }
    public void execute() {
        light.off();
    }
    public void undo() {
        light.on();
    }
}
