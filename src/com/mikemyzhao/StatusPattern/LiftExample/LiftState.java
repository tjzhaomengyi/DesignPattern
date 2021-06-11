package com.mikemyzhao.StatusPattern.LiftExample;

public abstract class LiftState {
    //定义一个环境角色，也就是封装状态的变化引起的功能变化
    protected Context context;
    public void setContext(Context _context){
        this.context = _context;
    }
    //首先电梯开启动作
    public abstract void open();
    //电梯关闭
    public abstract void close();
    //电梯运行
    public abstract void run();
    //电梯停下来
    public abstract void stop();
}
