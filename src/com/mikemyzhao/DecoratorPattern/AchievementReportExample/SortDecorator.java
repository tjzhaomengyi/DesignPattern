package com.mikemyzhao.DecoratorPattern.AchievementReportExample;

public class SortDecorator extends Decorator {
    public SortDecorator(SchoolReport sr) {
        super(sr);
    }

    //通知学校的排名情况
    private void reportSort(){
        System.out.println("排名38");
    }

    //看完成绩单，说下排名
    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}
