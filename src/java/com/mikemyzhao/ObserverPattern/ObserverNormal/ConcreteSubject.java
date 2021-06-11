package com.mikemyzhao.ObserverPattern.ObserverNormal;

public class ConcreteSubject extends Subject {
    public void doSomething(){
        super.notifyObservers();
    }
}
