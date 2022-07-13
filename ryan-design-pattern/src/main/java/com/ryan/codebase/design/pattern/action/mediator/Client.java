package com.ryan.codebase.design.pattern.action.mediator;

/**
 * @author ryan
 * @version Id: Client, v 0.1 2022/1/10 3:55 PM ryan Exp $
 */
public class Client {

    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);

        mediator.setColleague1(colleague1);
        mediator.setColleague2(colleague2);

        System.out.println("同事1发送消息：hello");
        colleague1.send("hello");
        colleague2.send("hello too");

    }
}
