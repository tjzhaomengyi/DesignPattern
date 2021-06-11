package com.mikemyzhao.BridgePattern.CoryExample;

public class House extends Product {
    @Override
    public void beProducted() {
        System.out.println("生产房子");
    }

    @Override
    public void beSelled() {
        System.out.println("房子卖了");

    }
}
