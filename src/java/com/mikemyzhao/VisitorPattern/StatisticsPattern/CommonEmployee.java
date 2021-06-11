package com.mikemyzhao.VisitorPattern.StatisticsPattern;

/**
 * 普通员工
 */
public class CommonEmployee extends Employee {
    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    //允许访问者访问
    @Override
    public void accept(IVisitor visitor){
        visitor.visit(this);
    }
}
