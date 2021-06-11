package com.mikemyzhao.ProxyPattern.NormalProxy;

public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer = null;

    //构造函数传递要对谁进行代练
    public GamePlayerProxy(String name){
        try{
            gamePlayer = new GamePlayer(this,name);
        } catch (Exception e){
            //To Do:
            System.out.println("有毛病");
        }
    }

    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user,password);
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }
}
