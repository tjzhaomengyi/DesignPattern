package com.mikemyzhao.ObserverPattern.ObserverHanfeiziExample;

/***
 * 观察者接口
 */
public interface Observer {
    //一发现别人有动静，自己要行动起来
    public void update(String context);
}
