package com.mikemyzhao.PrototypePattern.MailExample;

public class AdvTemplate {
    //广告信名称
    private String advSubject = "xx银行元旦信用卡抽奖活动";
    //广告信内容
    private String advContext = "元旦抽奖通知：只要刷一百万，iphoneXS带回家";
    //取得广告信名称
    public String getAdvSubject(){
        return this.advSubject;
    }
    //取得广告信内容
    public String getAdvContext(){
        return this.advContext;
    }
}
