package com.mikemyzhao.ObserverPattern.ObserverHanfeiziExample;

public class Zhaosi implements Observer {
    @Override
    public void update(String context) {
        System.out.println("赵四观察韩非子活动，开始向老板汇报");
        this.laugh(context);
        System.out.println("赵四嘎嘎乐啊");
    }

    public void laugh(String context){
        System.out.println("赵四:因为"+context+"----所以笑了");
    }
}
