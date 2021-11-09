package com.hmmloo.designpatterns.behavior.command1;

public class FanOnCommand implements Command{
    private final Fan fan;

    public FanOnCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.startRotate();
    }
}
