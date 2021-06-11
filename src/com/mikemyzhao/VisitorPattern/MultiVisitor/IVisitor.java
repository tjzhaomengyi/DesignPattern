package com.mikemyzhao.VisitorPattern.MultiVisitor;

public interface IVisitor {
    //首先定义可以访问的普通员工
    public void visit(CommonEmployee commonEmployee);
    //其次定义可以访问的部门经理
    public void visit(Manager manager);
}
