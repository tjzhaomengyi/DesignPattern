package com.mikemyzhao.PrototypePattern.MailExample;

import java.util.Random;

public class Client {
    private static int MAX_COUNT = 6;
    public static void main(String[] args){
        int i = 0;
        //把模板定义出来，这个是从数据中获得的
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("招商银行所有");
        while(i<MAX_COUNT){
            //以下是每封邮件不同的地方.
            Mail cloneMail = mail.clone();
            cloneMail.setAppellation(getRandString(5)+"先生");
            cloneMail.setReceiver(getRandString(5)+"@"+getRandString(8)+".com");
            //然后发送邮件
            sendMail(cloneMail);
            i++;
        }
    }

    //发送邮件
    public static void sendMail(Mail mail){
        System.out.println("标题："+mail.getSubject()+"\t收件人"+mail.getReceiver()+"\t"+mail.getContext()+"\t...发送成功");
    }
    //获得指定长度的随机字符串
    public static String getRandString(int maxLength){
        String source = "abcdefghijklmnopqrstuvwxyz";
        StringBuffer sb = new StringBuffer();
        Random rand = new Random();
        for(int i=0;i<maxLength;i++){
            sb.append(source.charAt(rand.nextInt(source.length())));
        }
        return sb.toString();
    }
}
