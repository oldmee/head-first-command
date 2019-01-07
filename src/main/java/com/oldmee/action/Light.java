package com.oldmee.action;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 13:43 2019/1/7
 */
public class Light {

    private String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " light is on");
    }

    public void off() {
        System.out.println(name + " light is off");
    }
}
