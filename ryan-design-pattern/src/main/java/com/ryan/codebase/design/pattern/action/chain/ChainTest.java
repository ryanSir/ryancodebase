package com.ryan.codebase.design.pattern.action.chain;

/**
 * @author ryan
 * @version Id: ChainTest, v 0.1 2022/1/10 4:41 PM ryan Exp $
 */
public class ChainTest {

    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.addHandler(new HandlerC());
        chain.addHandler(new HandlerD());
        chain.handle();
    }
}
