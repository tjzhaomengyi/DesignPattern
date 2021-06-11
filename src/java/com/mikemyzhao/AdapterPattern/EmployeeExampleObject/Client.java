package com.mikemyzhao.AdapterPattern.EmployeeExampleObject;

public class Client {
    public static void main(String[] args){
        IOuterUserBaseInfo baseInfo = new OuterUserBaseInfo();
        IOuterUserHomeInfo homeInfo = new OuterUserHomeInfo();
        IOuterUserOfficeInfo officeInfo = new OuterUserOfficeInfo();
        IUserInfo youngGirl = new OuterUserInfo(baseInfo,homeInfo,officeInfo);
        youngGirl.getUserName();
        youngGirl.getHomeTelNumber();
    }
}
