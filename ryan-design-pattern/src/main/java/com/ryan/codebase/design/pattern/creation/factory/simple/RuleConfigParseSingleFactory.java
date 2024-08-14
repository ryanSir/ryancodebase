package com.ryan.codebase.design.pattern.creation.factory.simple;

import com.ryan.codebase.design.pattern.creation.factory.IRuleConfigParse;
import com.ryan.codebase.design.pattern.creation.factory.JsonRuleConfigParse;
import com.ryan.codebase.design.pattern.creation.factory.XmlRuleConfigParse;

import java.util.HashMap;
import java.util.Map;

/**
 * 简单工厂
 *
 * @author Ryan
 * @version Id: RuleConfigParseFactory, v 0.1 2020/11/19 上午10:26 ryan Exp $
 */
public class RuleConfigParseSingleFactory {

    private static final Map<String, IRuleConfigParse> cachedParsed = new HashMap<String, IRuleConfigParse>();

    static {
        cachedParsed.put("json", new JsonRuleConfigParse());
        cachedParsed.put("xml", new XmlRuleConfigParse());
    }

    public static IRuleConfigParse createParse(String configFormat) {
        return cachedParsed.get(configFormat);
    }

}