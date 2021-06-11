package com.mikemyzhao.FactoryPattern.CreateHuman.Factory;


import com.mikemyzhao.FactoryPattern.CreateHuman.Human.Human;

/**
 * 抽象人类创建工厂，必须是Class类型，返回的必须是Human的实现类，
 * T表示只要实现了Human接口的类都可以作为参数
 */
public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> c);
}
