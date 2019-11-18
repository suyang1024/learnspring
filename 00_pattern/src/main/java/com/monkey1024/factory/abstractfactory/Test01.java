package com.monkey1024.factory.abstractfactory;

/**
 * Created by thinkpad on 2019/10/7.
 */
public class Test01 {
    public static void main(String[] args) {
        IPhoneFactory iPhoneFactory = new IPhoneFactory();
        Charger charger = iPhoneFactory.produceCharger();
        Phone phone = iPhoneFactory.producePhone();
        charger.charge();
        phone.play();
    }
}
