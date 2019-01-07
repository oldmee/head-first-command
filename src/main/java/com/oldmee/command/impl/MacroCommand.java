package com.oldmee.command.impl;

import com.oldmee.command.Command;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 16:48 2019/1/7
 */
public class MacroCommand implements Command {
    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    public void execute() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
        }
    }

    public void undo() {

    }
}
