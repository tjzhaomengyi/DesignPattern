package com.mikemyzhao.CompositePattern.CompositeNormal;

/**
 * Component是一个Composite或者Leaf
 */
public class Component {
    //个体和整体都具有的共享
    public void doSomething(){
        System.out.println("我是一个Component,是一个leaf或者是一个Composite");
        //编写业务逻辑
    }
}
