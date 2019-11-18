package com.monkey1024.factory.abstractfactory;

/**
 * Created by thinkpad on 2019/10/7.
 */
public class IPhoneCharger implements Charger {
    @Override
    public void charge() {
        System.out.println("给苹果手机充电");
    }
}
