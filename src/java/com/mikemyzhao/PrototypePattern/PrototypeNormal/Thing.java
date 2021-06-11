package com.mikemyzhao.PrototypePattern.PrototypeNormal;

/***
 * 简单的可拷贝对象
 */
public class Thing implements Cloneable{
    public Thing(){
        System.out.println("构造函数被执行了");
    }

    public Thing clone(){
        Thing thing = null;
        try {
            thing = (Thing)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }

}
