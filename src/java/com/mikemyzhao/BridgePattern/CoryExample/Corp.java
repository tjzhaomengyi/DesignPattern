package com.mikemyzhao.BridgePattern.CoryExample;

public abstract class Corp {
    //定义一个抽象的产品对象，
    private Product product;
    public Corp(Product product){
        this.product = product;
    }
    public void makeMoney(){
        //每家公司都是一样的，先生产
        this.product.beProducted();
        this.product.beSelled();
    }
}
