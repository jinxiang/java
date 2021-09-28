package com.hmmloo.designpatterns.behavior.command.invoker;

import com.hmmloo.designpatterns.behavior.command.commandobjects.CommandBase;

public class RemoteControl {
    CommandBase onCommand, offCommand, undoCommand;

    public void onButtonPressed(CommandBase onCommand) {
        this.onCommand = onCommand;
        onCommand.execute();
        undoCommand = onCommand;
    }

    public void offButtonPressed(CommandBase offCommand) {
        this.offCommand = offCommand;
        offCommand.execute();
        undoCommand = offCommand;
    }

    public void undoButtonPressed() {
        undoCommand.undo();
    }
}
