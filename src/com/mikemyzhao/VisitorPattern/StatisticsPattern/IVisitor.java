package com.mikemyzhao.VisitorPattern.StatisticsPattern;

public interface IVisitor {
    //首先定义可以访问的普通员工
    public void visit(CommonEmployee commonEmployee);
    //其次定义可以访问的部门经理
    public void visit(Manager manager);
    //统计所有员工的工资
    public int getTotalSalary();
}
