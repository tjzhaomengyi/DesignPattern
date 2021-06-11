package com.mikemyzhao.PrototypePattern.DeepAndShallowCopy;

import java.util.ArrayList;

public class ShallowThing implements Cloneable {
    //定义一个私有变量
    private ArrayList<String> arrayList = new ArrayList<String>();
    public ShallowThing Clone(){
        ShallowThing shallowThing = null;
        try {
            shallowThing = (ShallowThing) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return shallowThing;
    }

    public void setValue(String value){
        this.arrayList.add(value);
    }

    //取得arrayList的值
    public ArrayList<String> getValue(){
        return this.arrayList;
    }
}
