package com.ryan.codebase.design.pattern.action.strategy;

/**
 * @author ryan
 * @version Id: ConcreteStrategyB, v 0.1 2021/12/30 8:24 PM ryan Exp $
 */
public class ConcreteStrategyB  implements Strategy{

    @Override
    public void strategyMethod() {
        System.out.println("策略2");
    }
}
