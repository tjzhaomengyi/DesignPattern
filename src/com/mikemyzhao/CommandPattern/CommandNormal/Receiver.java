package com.mikemyzhao.CommandPattern.CommandNormal;

/**
 * 抽象接收者
 */
public abstract class Receiver {
    //抽象接受者，定义每个接收者都必须完成的业务
    public abstract void doSomething();
}
