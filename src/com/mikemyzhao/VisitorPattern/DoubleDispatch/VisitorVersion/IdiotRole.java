package com.mikemyzhao.VisitorPattern.DoubleDispatch.VisitorVersion;

public class IdiotRole implements Role {
    @Override
    public void accept(AbsActor actor) {
        actor.act(this);
    }
}
