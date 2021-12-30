package com.ryan.codebase.design.pattern.action.strategy;

/**
 * @author ryan
 * @version Id: StrategyTest, v 0.1 2021/12/30 8:25 PM ryan Exp $
 */
public class StrategyTest {

    public static void main(String[] args)  {
        Strategy strategy =null;
        String type = "A";
        try {
            StrategyFactory.provideConcreteStrategy(type).strategyMethod();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }


}
