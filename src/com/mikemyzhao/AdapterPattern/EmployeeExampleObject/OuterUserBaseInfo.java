package com.mikemyzhao.AdapterPattern.EmployeeExampleObject;

import java.util.HashMap;
import java.util.Map;

public class OuterUserBaseInfo implements IOuterUserBaseInfo {
    @Override
    public Map getUserBaseInfo() {
        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("userName","员工叫混世魔王");
        baseInfoMap.put("mobileNumber","员工电话是");
        return baseInfoMap;
    }
}
