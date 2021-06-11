package com.mikemyzhao.CommandPattern.CompanyExample;

public class Client {
    public static void main(String[] args){
        //定义接头人
        Invoker xiaosan = new Invoker();
        System.out.println("----客户需要增加一个需求------");
        //客服下命令来
        Command command = new AddRequirementCommand();
        //接头人接收命令
        xiaosan.setCommand(command);
        xiaosan.action();

        System.out.println("----客户要求删除一个页面----");
        Command command1 = new DeletePageCommand();
        xiaosan.setCommand(command1);
        xiaosan.action();
    }
}
