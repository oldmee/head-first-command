package com.oldmee.command.impl;

import com.oldmee.action.Light;
import com.oldmee.command.Command;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 15:02 2019/1/7
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }

    public void undo() {
        light.on();
    }
}
