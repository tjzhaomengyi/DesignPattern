package com.mikemyzhao.BridgePattern.CoryExample;

public class ShanZhaiCorp extends Corp {
    public ShanZhaiCorp(Product product) {
        super(product);
    }

    public void makeMoney(){
        super.makeMoney();
        System.out.println("脑残山寨公司");
    }
}
