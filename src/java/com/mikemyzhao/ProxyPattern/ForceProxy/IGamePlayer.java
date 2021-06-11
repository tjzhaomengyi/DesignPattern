package com.mikemyzhao.ProxyPattern.ForceProxy;

public interface IGamePlayer {
    public void login(String user, String password);

    public void killBoss();

    public void upgrade();

    //每个人都可以找一个自己的代理
    public IGamePlayer getProxy();
}
