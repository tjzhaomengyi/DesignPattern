package com.mikemyzhao.VisitorPattern.DoubleDispatch.VisitorVersion;


public class Client {
    public static void main(String[] args){
        AbsActor actor = new OldActor();
        Role role = new KungFuRole();
        role.accept(actor);
    }
}

