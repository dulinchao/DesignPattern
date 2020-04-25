package com.dlc.command;

public class LightOnCommand implements Command{
    LightReceiver light;

    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }
    public void execute() {
        light.on();
    }
    public void undo() {
        light.off();
    }
}
