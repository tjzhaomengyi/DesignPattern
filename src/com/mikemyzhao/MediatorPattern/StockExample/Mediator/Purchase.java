package com.mikemyzhao.MediatorPattern.StockExample.Mediator;

public class Purchase extends AbstractColleage{


    public Purchase(AbstractMediator _mediator) {
        super(_mediator);
    }

    //采购IBM电脑
    public void buyIBMcomputer(int number){
       super.mediator.execute("purchase.buy",number);
    }

    //不再采购IBM电脑
    public void refuseBuyIBM(){
        System.out.println("不再采购IBM电脑。");
    }
}
