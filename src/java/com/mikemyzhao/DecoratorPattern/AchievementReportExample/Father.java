package com.mikemyzhao.DecoratorPattern.AchievementReportExample;

/**
 * 爹看成绩
 */
public class Father {
    public static void main(String[] args){
        //拿来成绩单
        SchoolReport sr;
        //原装的成绩单
        sr = new FouthGradeSchoolReport();
        //加了高分的成绩单
        sr = new HighScoreDecorator(sr);
        //加了排名的成绩单
        sr = new SortDecorator(sr);
        sr.report();
        sr.sign("我是你爹");
    }
}
