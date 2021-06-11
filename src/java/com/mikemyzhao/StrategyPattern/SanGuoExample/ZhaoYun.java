package com.mikemyzhao.StrategyPattern.SanGuoExample;

public class ZhaoYun {
    public static void main(String[] args){
        Context context;

        System.out.println("-----刚到吴国打开第一个------");
        context = new Context(new BackDoor());
        context.operate();

        System.out.println("----刘备乐不思蜀打开了第二个-----");
        context = new Context(new GivenGreenLight());
        context.operate();

        System.out.println("------孙权的小兵追来，打开第三个------");
        context = new Context(new BlockEnemy());
        context.operate();

    }
}
