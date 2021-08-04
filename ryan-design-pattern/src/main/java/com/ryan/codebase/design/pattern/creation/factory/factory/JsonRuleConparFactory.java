package com.ryan.codebase.design.pattern.creation.factory.factory;

import com.ryan.codebase.design.pattern.creation.factory.IRuleConfigParse;
import com.ryan.codebase.design.pattern.creation.factory.JsonRuleConfigParse;

/**
 * @author Ryan
 * @version Id: JsonRuleConparFactory, v 0.1 2020/11/19 上午10:41 ryan Exp $
 */
public class JsonRuleConparFactory implements IRuleConParFactory {

    public IRuleConfigParse createParse() {
        return new JsonRuleConfigParse();
    }
}