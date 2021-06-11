package com.mikemyzhao.FactoryPattern.CreateHuman.Human;

public class BlackHuman implements Human{


    @Override
    public void getColor() {
        System.out.println("黑人皮肤颜色是黑色的");
    }

    @Override
    public void talk() {
        System.out.println("黑人说黑话");
    }
}
