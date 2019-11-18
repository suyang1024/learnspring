package com.monkey1024.factory.abstractfactory;

/**
 * Created by thinkpad on 2019/10/7.
 */
public class XiaomiFactory implements PhoneFactory {
    @Override
    public Charger produceCharger() {
        return new XiaomiCharger();
    }

    @Override
    public Phone producePhone() {
        return new Xiaomi8();
    }
}
