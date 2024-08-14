package com.ryan.codebase.design.pattern.action.strategy;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 策略工厂
 *
 * @author ryan
 * @version Id: StrategyFactory, v 0.1 2021/12/30 8:32 PM ryan Exp $
 */
public class StrategyFactory {
    private static final Map<String,Strategy> map = new HashMap<>();
    static {
        map.put("A",new ConcreteStrategyA());
        map.put("B",new ConcreteStrategyB());
    }
    public static Strategy provideConcreteStrategy(String type) throws IllegalAccessException {
        if (StringUtils.isEmpty(type)){
            throw new IllegalAccessException("error");
        }
        return map.get(type);
    }
}
