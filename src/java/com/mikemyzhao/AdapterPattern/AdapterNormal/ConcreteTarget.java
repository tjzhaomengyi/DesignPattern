package com.mikemyzhao.AdapterPattern.AdapterNormal;

public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("如果需要帮助，叫我");
    }
}
