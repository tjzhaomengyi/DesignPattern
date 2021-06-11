package com.mikemyzhao.VisitorPattern.DoubleDispatch.VisitorVersion;


public class KungFuRole implements Role {
    @Override
    public void accept(AbsActor actor) {
        actor.act(this);
    }

}
