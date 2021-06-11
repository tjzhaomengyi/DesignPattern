package com.mikemyzhao.VisitorPattern.MultiVisitor;

public class TotalVisitor implements ITotalVisitor {
    //部门经理的工资系数是5
    private final static int MANANGER_COEFFICIENT = 5;
    //员工的工资系数是2
    private final static int COMMONEMPLOYEE_COEFFICIENT = 2;
    //普通员工的工资总和
    private int commonTotalSalary = 0;
    //部门经理的工资总和
    private int managerTotalSalary = 0;

    //计算部门经理的工资总和
    @Override
    public void visit(Manager manager){
        this.managerTotalSalary = this.managerTotalSalary+manager.getSalary() * MANANGER_COEFFICIENT;
    }

    @Override
    //计算员工的工资总和
    public void visit(CommonEmployee commonEmployee){
        this.commonTotalSalary = this.commonTotalSalary + commonEmployee.getSalary() * COMMONEMPLOYEE_COEFFICIENT;
    }

    //计算所有工资总和
    @Override
    public void totalSalary() {
        System.out.println("本月工资总额是"+(this.commonTotalSalary+this.managerTotalSalary));

    }
}
