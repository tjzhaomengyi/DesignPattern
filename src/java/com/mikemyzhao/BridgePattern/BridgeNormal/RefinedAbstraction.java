package com.mikemyzhao.BridgePattern.BridgeNormal;

public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor _imp) {
        super(_imp);
    }

    //修正父类行为
    @Override
    public void request(){
        super.request();
        super.getImp().doAnything();
    }
}
