package com.monkey1024.proxy;

public class You {

    private Beauty beauty;

    public You(Beauty beauty) {
        this.beauty = beauty;
    }

    public void makeFriend() {
        beauty.eat();
    }

    public void show() {
        beauty.gift(10);
    }
}
