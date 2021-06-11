package com.mikemyzhao.ObserverPattern.ObserverHanfeiziExample;

/**
 * Observable是被观察者，类似韩非子这样的人
 * 三个重要的方法：增加观察者，删除观察者，通知所有观察者
 */

public interface Observable {
    public void addObserver(Observer observer);
    public void deleteObserver(Observer observer);
    public void notifyObservers(String context);
}
