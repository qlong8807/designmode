package com.example.designmode.ch08_mediator;

public abstract class AbstractColleague {
    protected AbstractMediator mediator;
    public AbstractColleague(AbstractMediator _mediator){
        this.mediator = _mediator;
    }
}