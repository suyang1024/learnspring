package com.monkey1024.factory.staticfactory;

/**
 * Created by thinkpad on 2019/10/7.
 */
public class IPhoneFactory {

    public static IPhone produce(String model) {
        if ("iphonex".equalsIgnoreCase(model)) {
            return new IPhoneX();
        } else if ("iphone8plus".equalsIgnoreCase(model)) {
            return new IPhone8Plus();
        } else {
            return null;
        }
    }
}
