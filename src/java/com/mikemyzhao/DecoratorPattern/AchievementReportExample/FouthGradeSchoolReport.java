package com.mikemyzhao.DecoratorPattern.AchievementReportExample;

/**
 * 基本成绩单
 */
public class FouthGradeSchoolReport extends SchoolReport {
    @Override
    public void report() {
        //成绩单是这个样子的
        System.out.println("尊敬的XXX家长");
        System.out.println("......");
        System.out.println("语文 62，数学65，体育85，自然63");
        System.out.println("家长签字 ：");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长签字为："+name);
    }
}
