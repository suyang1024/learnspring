package com.monkey1024.factory.abstractfactory;

/**
 * Created by thinkpad on 2019/10/7.
 */
public class XiaomiCharger implements Charger {
    @Override
    public void charge() {
        System.out.println("给小米手机充电");
    }
}
