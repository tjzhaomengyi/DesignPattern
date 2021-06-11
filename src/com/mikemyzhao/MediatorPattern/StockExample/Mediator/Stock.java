package com.mikemyzhao.MediatorPattern.StockExample.Mediator;

public class Stock extends AbstractColleage{
    //刚开始有100台电脑
    private static int COMPUTER_NUMBER = 100;

    public Stock(AbstractMediator _mediator) {
        super(_mediator);
    }

    //库存增加
    public void increase(int number){
        COMPUTER_NUMBER = COMPUTER_NUMBER + number;
        System.out.println("库存数量为:"+COMPUTER_NUMBER);
    }

    //库存减少
    public void decrease(int number){
        COMPUTER_NUMBER = COMPUTER_NUMBER - number;
        System.out.println("库存数量为:"+COMPUTER_NUMBER);
    }

    //获得库存数量
    public int getStockNumber(){
        return COMPUTER_NUMBER;
    }

    //库存压力大了，就要通知采购人员不要采购，采购人员应该尽快销售
    public void clearStock(){

        System.out.println("清理存货数量为:"+COMPUTER_NUMBER);
        super.mediator.execute("stock.clear");
    }
}
