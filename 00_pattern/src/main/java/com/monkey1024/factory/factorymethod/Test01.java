package com.monkey1024.factory.factorymethod;

/**
 * Created by thinkpad on 2019/10/7.
 */
public class Test01 {
    public static void main(String[] args) {
        IPhone8PlusFactory iPhone8PlusFactory = new IPhone8PlusFactory();
        IPhone produce = iPhone8PlusFactory.produce();
        produce.play();
    }
}
