package com.mikemyzhao.StatusPattern.StatusNormal;

public class ConcreteState2 extends State {
    @Override
    public void handle1() {
        //设置当前状态为state1
        super.context.setCurrentState(Context.STATE1);
        super.context.handle1();
    }

    @Override
    public void handle2() {
        System.out.println("状态2下必须执行的逻辑");
    }
}
