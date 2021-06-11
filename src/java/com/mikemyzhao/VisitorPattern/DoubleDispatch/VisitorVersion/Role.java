package com.mikemyzhao.VisitorPattern.DoubleDispatch.VisitorVersion;


public interface Role {
    //演员要饰演的角色
    public void accept(AbsActor actor);
}
