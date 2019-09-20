package com.monkey1024.proxy;

public class XiaoMan implements Beauty {
    @Override
    public void eat() {
        System.out.println("小曼吃饭");
    }

    @Override
    public void gift(int count) {
        System.out.println("小曼收的了" + count + "个礼物");
    }
}
