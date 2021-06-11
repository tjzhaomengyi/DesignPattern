package com.mikemyzhao.DecoratorPattern.AchievementReportExample;

/**
 * 最高成绩的修饰器
 */
public class HighScoreDecorator extends Decorator {
    public HighScoreDecorator(SchoolReport sr) {
        super(sr);
    }

    //汇报最高成绩
    private void reportHighScore(){
        System.out.println("这次语文最高75，数学78，自然80");
    }

    @Override
    public void report(){
        this.reportHighScore();
        super.report();
    }

}
