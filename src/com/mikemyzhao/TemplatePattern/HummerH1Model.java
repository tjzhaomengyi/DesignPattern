package com.mikemyzhao.TemplatePattern;

public class HummerH1Model extends HummerModel{
    private boolean alarmFlag = true;
    @Override
    protected void start() {
        System.out.println("悍马H1发动");
    }

    @Override
    protected void stop() {
        System.out.println("悍马H1停车");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马H1鸣笛！");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马H1的引擎声是这样的");
    }

    protected boolean isAlarm(){
        return this.alarmFlag;
    }

    //是否响喇叭，用户来决定
    public void setAlarm(boolean isAlarm){
        this.alarmFlag = isAlarm;
    }
}
