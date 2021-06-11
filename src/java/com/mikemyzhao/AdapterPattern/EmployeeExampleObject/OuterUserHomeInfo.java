package com.mikemyzhao.AdapterPattern.EmployeeExampleObject;

import java.util.HashMap;
import java.util.Map;

public class OuterUserHomeInfo implements IOuterUserHomeInfo {
    @Override
    public Map getUserHomeInfo() {
        HashMap homeInfo = new HashMap<>();
        homeInfo.put("homeTelNumber","员工的家庭电话");
        homeInfo.put("homeAddress","员工的家庭住址是");
        return homeInfo;
    }
}
