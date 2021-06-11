package com.mikemyzhao.AdapterPattern.EmployeeExampleObject;

import java.util.HashMap;
import java.util.Map;

public class OuterUserOfficeInfo implements IOuterUserOfficeInfo {
    @Override
    public Map getUserOfficeInfo() {
        HashMap officeInfo = new HashMap();
        officeInfo.put("jobPosition","扫地的");
        officeInfo.put("officeTelNumber","办公电话");
        return officeInfo;
    }
}
