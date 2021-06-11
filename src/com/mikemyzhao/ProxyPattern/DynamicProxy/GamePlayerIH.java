package com.mikemyzhao.ProxyPattern.DynamicProxy;

import com.mikemyzhao.ProxyPattern.PersonalProxy.GamePlayer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 使用动态代理
 * invoke方法是接口InvocationHandler必须实现的，它完成对真实方法的调用。
 * 1、InvocationHandler接口，动态代理是根据被代理的接口生成所有的方法，也就是说给定一个接口，
 * 动态代理会宣称"我已经实现该接口的所有方法了"。
 * 2、动态代理怎么才能实现被代理接口中的方法呢？
 * 默认情况下所有的方法返回值都是空的，代理已经实现它了，但是没有任何逻辑意义，那怎么办？
 * 通过InvocationHandler接口，所有方法都由该Handler来进行处理，即所有被代理的方法都由InvocationHandler接管实际的处理任务
 */

public class GamePlayerIH implements InvocationHandler {
    Class cls = null;
    Object obj = null;
    //我要代理谁
    public GamePlayerIH(Object _obj){
        this.obj = _obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj,args);
        if(method.getName().equalsIgnoreCase("login")){
            System.out.println("有人在使用我的账号登陆！");
        }
        return result;
    }
}
