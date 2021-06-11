package com.mikemyzhao.AdapterPattern.EmployeeExampleByClass;

public class Client {
    public static void main(String[] args){
        IUserInfo youngGirl = new UserInfo();
        youngGirl.getMobileNumber();

        IUserInfo waibaoGirl = new OuterUserInfo();
        waibaoGirl.getUserName();
        waibaoGirl.getMobileNumber();
    }
}
