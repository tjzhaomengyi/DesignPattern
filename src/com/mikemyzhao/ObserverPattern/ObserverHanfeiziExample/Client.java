package com.mikemyzhao.ObserverPattern.ObserverHanfeiziExample;

public class Client {
    public static void main(String[] args){
        Observer lisi = new Lisi();
        Observer zhaosi = new Zhaosi();
        Observer wangsi = new Wangsi();
        HanFeiZi hanfeizi = new HanFeiZi();
        hanfeizi.addObserver(lisi);
        hanfeizi.addObserver(wangsi);
        hanfeizi.addObserver(zhaosi);
        hanfeizi.haveBreakFast();
        hanfeizi.haveFun();
    }
}
