package com.mikemyzhao.ObserverPattern.ObserverHanfeiziExample;


public class Lisi implements Observer {

    @Override
    public void update(String context) {
        System.out.println("李斯观察韩非子活动，开始向老板汇报");
        this.reportToQinShiHuang(context);
        System.out.println("汇报完毕");
    }

    public void reportToQinShiHuang(String reportContext){
        System.out.println("李斯：向秦老板汇报---"+reportContext);
    }
}
