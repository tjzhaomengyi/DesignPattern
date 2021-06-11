package com.mikemyzhao.ObserverPattern.ObserverHanfeiziExample;

public class Wangsi implements Observer {
    @Override
    public void update(String context) {
        System.out.println("王斯观察韩非子活动，自己也开始活动");
        this.cry(context);
        System.out.println("王斯哭死了");
    }

    private void cry(String context){
        System.out.println("王斯：因为"+context+"----所以我这个悲伤啊");
    }
}
