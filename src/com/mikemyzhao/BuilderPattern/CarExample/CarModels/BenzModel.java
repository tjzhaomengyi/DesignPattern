package com.mikemyzhao.BuilderPattern.CarExample.CarModels;

public class BenzModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("奔驰车跑");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰车停");
    }

    @Override
    protected void alarm() {
        System.out.println("奔驰车鸣笛");
    }

    @Override
    protected void engineBoom() {
        System.out.println("奔驰车引擎声音");
    }
}
