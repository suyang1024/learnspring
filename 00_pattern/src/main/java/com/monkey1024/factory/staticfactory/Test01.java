package com.monkey1024.factory.staticfactory;

/**
 * Created by thinkpad on 2019/10/7.
 */
public class Test01 {
    public static void main(String[] args) {
        IPhone iphonex = IPhoneFactory.produce("iphonex");
        iphonex.play();
    }
}
