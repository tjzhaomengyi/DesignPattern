package com.mikemyzhao.ProxyPattern.DynamicProxyModel;

public class DevClient {
    public static void main(String[] args){
        //定义一个主题
        Subject subject = new RealSubject();
        //定义主题的代理
        Subject proxy = SubjectDynamicProxy.newProxyInstance(subject);
        //代理的行为
        proxy.doSomething("完成");
    }
}
