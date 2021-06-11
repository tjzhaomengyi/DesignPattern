package com.mikemyzhao.MediatorPattern.StockExample.Mediator;

public abstract class AbstractColleage {
    protected AbstractMediator mediator;
    public AbstractColleage(AbstractMediator _mediator){
        this.mediator = _mediator;
    }
}
