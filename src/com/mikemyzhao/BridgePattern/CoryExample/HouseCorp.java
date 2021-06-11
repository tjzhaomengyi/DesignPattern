package com.mikemyzhao.BridgePattern.CoryExample;

public class HouseCorp extends Corp {
    public HouseCorp(Product product) {
        super(product);
    }

    public void makeMoney(){
        super.makeMoney();
        System.out.println("狗逼房地产公司");
    }
}
