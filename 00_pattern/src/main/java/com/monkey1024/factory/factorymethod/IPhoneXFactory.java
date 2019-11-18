package com.monkey1024.factory.factorymethod;

/**
 * Created by thinkpad on 2019/10/7.
 */
public class IPhoneXFactory implements IPhoneFactory {
    @Override
    public IPhone produce() {
        return new IPhoneX();
    }
}
