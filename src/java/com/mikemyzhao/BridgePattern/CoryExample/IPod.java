package com.mikemyzhao.BridgePattern.CoryExample;

public class IPod extends Product {
    @Override
    public void beProducted() {
        System.out.println("生产IPod");
    }

    @Override
    public void beSelled() {
        System.out.println("IPod卖出去了");
    }
}
