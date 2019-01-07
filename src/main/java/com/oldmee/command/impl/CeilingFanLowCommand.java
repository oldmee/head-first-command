package com.oldmee.command.impl;

import com.oldmee.action.CeilingFan;
import com.oldmee.command.Command;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 15:57 2019/1/7
 */
public class CeilingFanLowCommand implements Command {
    CeilingFan ceilingFan;
    int preSpeed;

    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        preSpeed = ceilingFan.getSpeed();
        ceilingFan.low();
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
