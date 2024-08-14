package com.ryan.codebase.design.pattern.creation.factory.simple;

import com.ryan.codebase.design.pattern.creation.factory.IRuleConfigParse;
import com.ryan.codebase.design.pattern.creation.factory.JsonRuleConfigParse;
import com.ryan.codebase.design.pattern.creation.factory.XmlRuleConfigParse;

/**
 * 简单工厂
 *
 * @author Ryan
 * @version Id: RuleConfigParseFactory, v 0.1 2020/11/19 上午10:26 ryan Exp $
 */
public class RuleConfigParseFactory {


    public static IRuleConfigParse createParse(String format) {

        IRuleConfigParse parse = null;

        if ("json".equals(format)) {
            // ...
            parse = new JsonRuleConfigParse();
        }
        if ("xml".equals(format)) {
            parse = new XmlRuleConfigParse();
        }
        return parse;
    }
}