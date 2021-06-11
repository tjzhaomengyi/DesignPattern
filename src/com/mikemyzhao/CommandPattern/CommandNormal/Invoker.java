package com.mikemyzhao.CommandPattern.CommandNormal;

public class Invoker {
    private Command command;
    //受气包，接收命令
    public void setCommand(Command _command){
        this.command = _command;
    }
    //执行命令
    public void action(){
        this.command.execute();
    }

}
