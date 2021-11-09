package com.hmmloo.designpatterns.behavior.command1;

public class Switch {
    private final Command upCommand, downCommand;

    public Switch(Command upCommand, Command downCommand) {
        this.upCommand = upCommand;
        this.downCommand = downCommand;
    }

    void flipUp() {
        upCommand.execute();
    }

    void flipDown() {
        downCommand.execute();
    }
}
