package com.hmmloo.designpatterns.behavior.command1;

public class TestCommand {
    public static void main(String[] args) {
        Light testLight = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(testLight);
        LightOffCommand lightOffCommand = new LightOffCommand(testLight);
        Switch lightSwitch = new Switch(lightOnCommand, lightOffCommand);
        lightSwitch.flipUp();
        lightSwitch.flipDown();

        Fan testFan = new Fan();
        FanOnCommand fanOnCommand = new FanOnCommand(testFan);
        FanOffCommand fanOffCommand = new FanOffCommand(testFan);
        Switch fanSwitch = new Switch(fanOnCommand, fanOffCommand);
        fanSwitch.flipUp();
        fanSwitch.flipDown();
    }
}
