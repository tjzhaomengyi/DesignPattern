package com.mikemyzhao.PrototypePattern.DeepAndShallowCopy;

public class ShallowClient {
    public static void main(String[] args){
        ShallowThing shallowThing = new ShallowThing();
        shallowThing.setValue("张三");
        //k拷贝一个对象
        ShallowThing cloneShallowThing = shallowThing.Clone();
        cloneShallowThing.setValue("李四");
        System.out.println(shallowThing.getValue());
    }
}
