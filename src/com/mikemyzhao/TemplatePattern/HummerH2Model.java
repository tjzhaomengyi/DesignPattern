package com.mikemyzhao.TemplatePattern;

public class HummerH2Model extends HummerModel {

    /**
     * 继承于模板，但是不让这辆车鸣笛
     */
    @Override
    protected void start() {
        System.out.println("悍马H2发动");
    }

    @Override
    protected void stop() {
        System.out.println("悍马H2停车");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马H2鸣笛！");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马H2的引擎声是这样的");
    }

    protected boolean isAlarm(){
        return false;
    }
}
