package com.ryan.codebase.design.pattern.action.mediator;

/**
 * @author ryan
 * @version Id: ConcreteMediator, v 0.1 2022/1/10 3:49 PM ryan Exp $
 */
public class ConcreteMediator extends Mediator {

    private ConcreteColleague1 colleague1;

    private ConcreteColleague2 colleague2;

    public void setColleague1(ConcreteColleague1 colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(ConcreteColleague2 colleague2) {
        this.colleague2 = colleague2;
    }

    @Override
    public void send(String message, Colleague colleague) {
        if (colleague instanceof ConcreteColleague1) {
            colleague2.notify(message);
        } else {
            colleague1.notify(message);
        }
    }
}
