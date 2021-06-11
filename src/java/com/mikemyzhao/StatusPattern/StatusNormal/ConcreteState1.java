package com.mikemyzhao.StatusPattern.StatusNormal;

public class ConcreteState1 extends State {
    @Override
    public void handle1() {
        System.out.println("本状态下必须处理的逻辑");
    }

    @Override
    public void handle2() {
        //设置当前状态为state2
        super.context.setCurrentState(Context.STATE2);
        super.context.handle2();
    }
}
