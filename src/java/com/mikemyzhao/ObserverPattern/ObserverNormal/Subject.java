package com.mikemyzhao.ObserverPattern.ObserverNormal;


import java.util.Vector;

/**
 * 被观察者虚类
 */
public abstract class Subject {
    //定义一个观察者数组
    private Vector<Observer> observerVector = new Vector<Observer>();
    //增加一个观察者
    public void addObserver(Observer o){
        this.observerVector.add(o);
    }

    //删除一个观察者
    public void delObserver(Observer o){
        this.observerVector.remove(o);
    }

    //通知所有观察者
    public void notifyObservers(){
        for(Observer o:this.observerVector){
            o.update();
        }
    }
}
