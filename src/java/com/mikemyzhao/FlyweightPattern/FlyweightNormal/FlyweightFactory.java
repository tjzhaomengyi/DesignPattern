package com.mikemyzhao.FlyweightPattern.FlyweightNormal;

import java.util.HashMap;

public class FlyweightFactory {
    private static HashMap<String,Flyweight> pool = new HashMap<String,Flyweight>();

    //享元工厂
    public static Flyweight getFlyweight(String Extrinsic){
        Flyweight flyweight = null;
        //在池中没有对象
        if(pool.containsKey(Extrinsic)){
            flyweight = pool.get(Extrinsic);
        }else {
            //根据外部状态创建享元对象
            flyweight = new ConcreteFlyweight1(Extrinsic);
            pool.put(Extrinsic,flyweight);
        }
        return flyweight;
    }
}
