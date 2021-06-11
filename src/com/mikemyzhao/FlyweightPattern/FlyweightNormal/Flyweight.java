package com.mikemyzhao.FlyweightPattern.FlyweightNormal;

public abstract class Flyweight {
    //内部状态
    private String intrinsic;
    //外部状态
    protected final String Extrinsic;

    //要求享元角色必须接收外部状态
    public Flyweight(String _Extrinsic){
        this.Extrinsic = _Extrinsic;
    }

    //定义业务操作
    public abstract void operate();
    //内部状态的get/set
    public String getIntrinsic(){
        return intrinsic;
    }
    public void setIntrinsic(String intrinsic){
        this.intrinsic = intrinsic;
    }
}
