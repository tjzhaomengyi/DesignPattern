package com.mikemyzhao.CommandPattern.CompanyExample;

/**
 * 负责人，负责人接到客户的命令，立刻执行
 */
public class Invoker {
    private Command command;
    //客户发出命令
    public void setCommand(Command command){
        this.command = command;
    }
    //执行客户命令
    public void action(){
        this.command.execute();
    }
}
