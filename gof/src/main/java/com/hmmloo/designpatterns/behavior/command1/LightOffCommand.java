package com.hmmloo.designpatterns.behavior.command1;

public class LightOffCommand implements Command{
    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
