package com.mikemyzhao.FlyweightPattern.FlyweightNormal;

public class ConcreteFlyweight1 extends Flyweight {
    public ConcreteFlyweight1(String _Extrinsic) {
        super(_Extrinsic);
    }

    @Override
    public void operate() {
        //业务逻辑
    }
}
