package com.oldmee.command.impl;

import com.oldmee.action.CeilingFan;
import com.oldmee.command.Command;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 15:57 2019/1/7
 */
public class CeilingFanOffCommand implements Command {
    CeilingFan ceilingFan;
    int preSpeed;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        preSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
    }

    public void undo() {
        if (preSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        } else if (preSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        } else if (preSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        } else if (preSpeed == CeilingFan.OFF) {
            ceilingFan.off();
        }
    }
}
