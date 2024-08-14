package com.ryan.codebase.design.pattern.action.mediator;

/**
 * @author ryan
 * @version Id: Mediator, v 0.1 2022/1/10 3:47 PM ryan Exp $
 */
public abstract class Mediator {
    public abstract void send (String message,Colleague colleague);
}
