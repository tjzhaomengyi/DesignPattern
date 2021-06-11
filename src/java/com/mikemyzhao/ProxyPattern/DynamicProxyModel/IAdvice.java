package com.mikemyzhao.ProxyPattern.DynamicProxyModel;

/**
 * 通知接口及实现
 */
public interface IAdvice {
    //通知只有一个方法，执行即可
    public void exec();
}

class BeforeAdvice implements IAdvice{

    @Override
    public void exec() {
        System.out.println("我是前置通知，我被执行了啊");
    }
}
