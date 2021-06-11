package com.mikemyzhao.PrototypePattern.DeepAndShallowCopy;

public class DeepClient {
    public static void main(String[] args){
        DeepThing deepThing = new DeepThing();
        deepThing.setValue("张三");
        //k拷贝一个对象
        DeepThing deepCloneThing = deepThing.Clone();
        deepCloneThing.setValue("李四");
        System.out.println(deepThing.getValue());
        System.out.println(deepCloneThing.getValue());
    }
}
