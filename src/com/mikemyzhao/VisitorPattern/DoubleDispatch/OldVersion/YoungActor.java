package com.mikemyzhao.VisitorPattern.DoubleDispatch.OldVersion;

public class YoungActor extends AbsActor {
    //年轻演员喜欢功夫戏
    public void act(KungFuRole role){
        System.out.println("年轻演员喜欢功夫戏");
    }
}
