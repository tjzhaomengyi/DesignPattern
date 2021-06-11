package com.mikemyzhao.AdapterPattern.EmployeeExampleByClass;

import java.util.HashMap;
import java.util.Map;

public class OuterUser implements IOuterUser {
    @Override
    public Map getUserBaseInfo() {
        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("userName","员工叫混世魔王");
        baseInfoMap.put("mobileNumber","员工的手机号是...");
        return baseInfoMap;
    }

    @Override
    public Map getUserOfficeInfo() {
        HashMap officeInfo = new HashMap();
        officeInfo.put("jobPosistion","这位员工的职位是外包");
        officeInfo.put("officeTelNumber","员工的办公电话是....");
        return officeInfo;
    }

    @Override
    public Map getUserHomeInfo() {
        HashMap homeInfo = new HashMap();
        homeInfo.put("homeTelNumber","员工的家庭电话是...");
        homeInfo.put("homeAdress","员工的家庭地址是....");
        return homeInfo;
    }
}
