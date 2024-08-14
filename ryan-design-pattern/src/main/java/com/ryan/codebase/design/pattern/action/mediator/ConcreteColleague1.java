package com.ryan.codebase.design.pattern.action.mediator;

/**
 * @author ryan
 * @version Id: ConcreteColleague, v 0.1 2022/1/10 3:49 PM ryan Exp $
 */
public class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public void notify(String message) {
        System.out.println("同事1得到消息：" + message);
    }
}
