package com.mikemyzhao.VisitorPattern.StatisticsPattern;

public class Visitor implements IVisitor {
    //部门经理的工资系数是5
    private final static int MANANGER_COEFFICIENT = 5;
    //员工的工资系数是2
    private final static int COMMONEMPLOYEE_COEFFICIENT = 2;
    //普通员工的工资总和
    private int commonTotalSalary = 0;
    //部门经理的工资总和
    private int managerTotalSalary = 0;

    //计算部门经理的工资总和
    private void calManagerSalary(int salary){
        this.managerTotalSalary = this.managerTotalSalary+salary * MANANGER_COEFFICIENT;
    }

    //计算员工的工资总和
    private void calCommonSalary(int salary){
        this.commonTotalSalary = this.commonTotalSalary + salary * COMMONEMPLOYEE_COEFFICIENT;
    }

    //计算所有工资总和
    @Override
    public int getTotalSalary() {
        return this.commonTotalSalary + this.managerTotalSalary;
    }


    //普通员工访问
    @Override
    public void visit(CommonEmployee commonEmployee) {
        System.out.println(this.getCommonEmployeeInfo(commonEmployee));
        this.calCommonSalary(commonEmployee.getSalary());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(this.getManagerInfo(manager));
        this.calManagerSalary(manager.getSalary());
    }


    //组装基本信息
    private String getBasicInfo(Employee employee){
        String info = "姓名:"+employee.getName() + "\t";
        info = info + "性别:"+(employee.getSex()==Employee.FEMALE?"女":"男")+"\t";
        info = info + "薪水:"+employee.getSalary()+"\t";
        return info;
    }

    //组装出部门经理的信息
    private String getManagerInfo(Manager manager){
        String basicInfo = this.getBasicInfo(manager);
        String otherInfo = "业绩:"+manager.getPerformance()+"\t";
        return basicInfo + otherInfo;
    }

    //普通员工的信息
    private String getCommonEmployeeInfo(CommonEmployee commonEmployee){
        String basicInfo = this.getBasicInfo(commonEmployee);
        String otherInfo = "工作:"+commonEmployee.getJob()+"\t";
        return basicInfo+otherInfo;
    }
}
