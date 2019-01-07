package com.oldmee.RemoteControl;

import com.oldmee.command.Command;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 13:47 2019/1/7
 */
public class SimpleRemoteControl {
    Command command;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonWasPressed() {
        command.execute();
    }
}
