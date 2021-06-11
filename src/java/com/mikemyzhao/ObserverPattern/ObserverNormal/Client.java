package com.mikemyzhao.ObserverPattern.ObserverNormal;

public class Client {
    public static void main(String[] args){
        ConcreteSubject subject = new ConcreteSubject();
        Observer obs = new ConcreteObserver();
        subject.addObserver(obs);
        subject.doSomething();
    }
}
