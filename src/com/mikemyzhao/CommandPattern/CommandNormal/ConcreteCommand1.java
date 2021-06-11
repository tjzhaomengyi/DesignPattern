package com.mikemyzhao.CommandPattern.CommandNormal;

public class ConcreteCommand1 extends Command {
    //对哪个Receiver类进行处理
    private Receiver receiver;
    //构造函数传递接收者
    public ConcreteCommand1(Receiver receiver){
        this.receiver = receiver;
    }
    //必须实现一个命令
    @Override
    public void execute() {
        this.receiver.doSomething();
    }
    //业务处理

}
