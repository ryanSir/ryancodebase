package com.ryan.codebase.design.pattern.action.mediator;

/**
 * @author ryan
 * @version Id: Colleague, v 0.1 2022/1/10 3:47 PM ryan Exp $
 */
public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }
}
