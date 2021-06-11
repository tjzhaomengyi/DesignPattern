package com.mikemyzhao.TemplatePattern;

public abstract class HummerModel {
    /**
     * 这个模型是模板模式的基类，所有的子类都是这个基类继承来的
     * 这个模板加入了钩子，子类可以通过对钩子设置不同的参数，使得运行模板方法，根据子类设置的参数进行运行
     */
    //基本方法
    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();
    protected abstract void engineBoom();

    //模板方法,调用基本方法完成相关的逻辑
    final public void run(){
        this.start();
        this.engineBoom();
        if(this.isAlarm()){
            this.alarm();
        }
        this.stop();
    }

    /**
     * 钩子函数，默认喇叭能响
     */
    protected boolean isAlarm(){
        return true;
    }
}
