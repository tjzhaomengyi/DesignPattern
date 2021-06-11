package com.mikemyzhao.ProxyPattern.ForceProxy;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
    public static void main(String[] args){
//        IGamePlayer player = new GamePlayer("张三");
        //使用代理模式
        //定义代理proxy
        IGamePlayer player = new GamePlayer("张三");
//        IGamePlayer proxy = new GamePlayerProxy(player);//这样使用就有问题没有拿到proxy
        IGamePlayer force_proxy = player.getProxy();//通过player直接找到代理！！！这就是强制代理
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        System.out.println("开始时间"+df.format(new Date()));// new Date()为获取当前系统时间
//        player.login("zhangsan","pass");
//        player.killBoss();
//        player.upgrade();
        force_proxy.login("zhansan","pass");
        force_proxy.killBoss();
        force_proxy.upgrade();
        System.out.println("结束时间"+df.format(new Date()));
    }
}
