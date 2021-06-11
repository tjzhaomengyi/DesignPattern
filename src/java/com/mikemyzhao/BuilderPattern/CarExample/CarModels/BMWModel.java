package com.mikemyzhao.BuilderPattern.CarExample.CarModels;

public class BMWModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("宝马车跑");
    }

    @Override
    protected void stop() {
        System.out.println("宝马车停");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马车鸣笛");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马车引擎声音");
    }
}
