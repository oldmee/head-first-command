package com.oldmee.command.impl;

import com.oldmee.action.Light;
import com.oldmee.command.Command;
import org.junit.Test;

import java.util.Stack;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 13:41 2019/1/7
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }

    public void undo() {
        light.off();
    }
}
