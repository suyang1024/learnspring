package com.monkey1024.factory.abstractfactory;

/**
 * Created by thinkpad on 2019/10/7.
 */
public class IPhoneFactory implements PhoneFactory {
    @Override
    public Charger produceCharger() {
        return new IPhoneCharger();
    }

    @Override
    public Phone producePhone() {
        return new IPhone8();
    }
}
