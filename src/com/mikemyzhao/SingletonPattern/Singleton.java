package com.mikemyzhao.SingletonPattern;

/**
 * 单例模式
 * 优点：1、减少内存开销；2、驻留内存时间长；3、避免资源占用；4、单例模式可以在系统设置全局的访问点，优化和共享资源访问
 * 缺点：1、没有接口，不能扩展；2、不容易测试；、
 * 使用场景：1、生成序列号；2、项目需要共享访问点或者共享数据；3、数据库等资源访问；4、需要定义大量的静态常量或者静态方法（工具类）
 * 注意：线程同步问题
 */

public class Singleton {
    private static final Singleton singleton = new Singleton();
    //限制产生多个对象
    private Singleton(){

    }

    //通过该方法获得实例对象
    public static Singleton getSingleton(){
        return singleton;
    }
    //类中的其他方法尽量是static类型
    public static void doSomething(){

    }
}
