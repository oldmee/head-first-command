package com.oldmee.action;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 15:52 2019/1/7
 */
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM  = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println(location + " fan is on high");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println(location + " fan is on medium");
    }

    public void low() {
        speed = LOW;
        System.out.println(location + " fan is on low");
    }

    public void off() {
        speed = OFF;
        System.out.println(location + " fan is on off");
    }

    public int getSpeed() {
        return speed;
    }
}
