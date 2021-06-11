package com.mikemyzhao.ProxyPattern.DynamicProxy;

import com.mikemyzhao.ProxyPattern.GameProxyExample.GamePlayerProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
    public static void main(String[] args){
        IGamePlayer player = new GamePlayer("张三");
        InvocationHandler handler = new GamePlayerIH(player);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
       //获得类的class loader
        ClassLoader cl = player.getClass().getClassLoader();
        //动态产生一个代理者
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl,new Class[]{IGamePlayer.class},handler);
        proxy.login("zhangsan","123");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束时间"+df.format(new Date()));
    }
}
