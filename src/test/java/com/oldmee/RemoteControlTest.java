package com.oldmee;

import com.oldmee.RemoteControl.RemoteControl;
import com.oldmee.RemoteControl.RemoteControlWithUndo;
import com.oldmee.RemoteControl.SimpleRemoteControl;
import com.oldmee.action.CeilingFan;
import com.oldmee.action.Light;
import com.oldmee.command.Command;
import com.oldmee.command.impl.*;
import org.junit.Test;

import java.rmi.MarshalException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 13:51 2019/1/7
 */
public class RemoteControlTest {

    @Test
    public void macroTest() {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light light = new Light("Living Room");
        CeilingFan ceilingFan = new CeilingFan("Living Room");

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        Command[] partyOn = {lightOnCommand, ceilingFanHighCommand};
        Command[] partyOff = {lightOffCommand, ceilingFanOffCommand};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyoffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyoffMacro);
        System.out.println(remoteControl);
        System.out.println("---  Pushing Macro On  ---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("---  Pushing Macro Off  ---");
        remoteControl.offButtonWasPush(0);


    }

    @Test
    public void remoteTestForCeilingFan() {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        CeilingFan ceilingFan = new CeilingFan("Living Room");

        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0, ceilingFanMediumCommand, ceilingFanOffCommand);
        remoteControl.setCommand(1, ceilingFanHighCommand, ceilingFanOffCommand);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPush(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

    }

    @Test
    public void remoteTest() {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);


        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPush(1);
        remoteControl.undoButtonWasPushed();

    }

    @Test
    public void test() {
        Stack stack = new Stack();

        /*stack.push("1");
        stack.push("2");
        stack.push("3");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());*/

        Queue queue = new PriorityQueue();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

    }
}
