package com.mikemyzhao.VisitorPattern.StatisticsPattern;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args){
        IVisitor visitor = new Visitor();
        for(Employee emp:mockEmployee()){
            emp.accept(visitor);
        }
        System.out.println("本月的工资总额"+visitor.getTotalSalary());
    }

    public static List<Employee> mockEmployee(){
        List<Employee> emplist = new ArrayList<Employee>();
        CommonEmployee zhangsan = new CommonEmployee();
        zhangsan.setJob("程序员");
        zhangsan.setName("张三");
        zhangsan.setSalary(1500);
        zhangsan.setSex(Employee.MALE);
        emplist.add(zhangsan);

        CommonEmployee lisi = new CommonEmployee();
        lisi.setSex(Employee.FEMALE);
        lisi.setSalary(1000);
        lisi.setJob("美工");
        lisi.setName("李斯");
        emplist.add(lisi);

        Manager zhaoliu = new Manager();
        zhaoliu.setName("赵六");
        zhaoliu.setPerformance("牛逼");
        zhaoliu.setSalary(2000);
        zhaoliu.setSex(Employee.MALE);
        emplist.add(zhaoliu);
        return emplist;
    }
}
