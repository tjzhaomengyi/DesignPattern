package com.mikemyzhao.VisitorPattern.DoubleDispatch.OldVersion;

public class OldActor extends AbsActor {
    public void act(KungFuRole role){
        System.out.println("年龄大了，不演功夫了");
    }
}
