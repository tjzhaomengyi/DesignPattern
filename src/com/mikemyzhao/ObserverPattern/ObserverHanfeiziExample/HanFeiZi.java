package com.mikemyzhao.ObserverPattern.ObserverHanfeiziExample;

import java.util.ArrayList;

public class HanFeiZi implements IHanFeiZi,Observable{
    private ArrayList<Observer> observerList = new ArrayList<Observer>();
    @Override
    public void haveBreakFast() {
        System.out.println("韩非子吃饭");
        this.notifyObservers("老汉吃饭了");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子娱乐");
        this.notifyObservers("老韩在浪");
    }

    @Override
    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObservers(String context) {
        for(Observer observer:observerList){
            observer.update(context);
        }
    }
}
