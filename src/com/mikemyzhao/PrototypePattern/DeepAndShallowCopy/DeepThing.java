package com.mikemyzhao.PrototypePattern.DeepAndShallowCopy;

import java.util.ArrayList;

public class DeepThing implements Cloneable{
    //定义一个私有变量
    private ArrayList<String> arrayList = new ArrayList<String>();
    public DeepThing Clone(){
        DeepThing deepThing = null;
        try {
            deepThing = (DeepThing) super.clone();
            deepThing.arrayList = (ArrayList<String>) this.arrayList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return deepThing;
    }

    public void setValue(String value){
        this.arrayList.add(value);
    }

    //取得arrayList的值
    public ArrayList<String> getValue(){
        return this.arrayList;
    }
}
