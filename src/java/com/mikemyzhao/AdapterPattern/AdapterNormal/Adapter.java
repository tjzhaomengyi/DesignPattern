package com.mikemyzhao.AdapterPattern.AdapterNormal;

public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.doSomething();
    }
}
