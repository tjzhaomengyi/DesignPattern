package com.mikemyzhao.CommandPattern.CompanyExample;

public abstract class Command {
    //把三个组都定义好，子类可以直接使用
    protected RequirementGroup rg = new RequirementGroup();
    protected PageGroup pg = new PageGroup();
    protected CodeGroup cg = new CodeGroup();

    //只有一个方法，你要我做什么事情
    public  abstract void execute();
}
