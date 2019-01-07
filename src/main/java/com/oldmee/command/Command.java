package com.oldmee.command;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 13:38 2019/1/7
 */
public interface Command {
    void execute();
    void undo();
}
