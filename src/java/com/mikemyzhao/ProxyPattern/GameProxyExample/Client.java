package com.mikemyzhao.ProxyPattern.GameProxyExample;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

public class Client {
    public static void main(String[] args){
//        IGamePlayer player = new GamePlayer("张三");
        //使用代理模式
        IGamePlayer player = new GamePlayer("张三");
        //定义代理proxy
        IGamePlayer proxy = new GamePlayerProxy(player);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        System.out.println("开始时间"+df.format(new Date()));// new Date()为获取当前系统时间
//        player.login("zhangsan","pass");
//        player.killBoss();
//        player.upgrade();
        proxy.login("zhansan","pass");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束时间"+df.format(new Date()));
    }
}
