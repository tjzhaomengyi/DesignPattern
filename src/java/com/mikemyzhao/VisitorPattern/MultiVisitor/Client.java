package com.mikemyzhao.VisitorPattern.MultiVisitor;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args){
        IShowVisitor showVisitor = new ShowVisitor();
        ITotalVisitor totalVisitor = new TotalVisitor();
        for(Employee emp:mockEmployee()){
            emp.accept(showVisitor);
            emp.accept(totalVisitor);
        }
        showVisitor.report();
        totalVisitor.totalSalary();
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
