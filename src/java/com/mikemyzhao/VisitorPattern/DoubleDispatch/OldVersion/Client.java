package com.mikemyzhao.VisitorPattern.DoubleDispatch.OldVersion;

public class Client {
    public static void main(String[] args){
        AbsActor actor = new OldActor();
        Role role = new KungFuRole();
        IdiotRole idrole = new IdiotRole();
        actor.act(role);
        actor.act(new KungFuRole());
        actor.act(idrole);
    }
}

