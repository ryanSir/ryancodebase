package com.ryan.codebase.design.pattern.creation.factory.abstra;

import com.ryan.codebase.design.pattern.creation.factory.IRuleConfigParse;
import com.ryan.codebase.design.pattern.creation.factory.JsonRuleConfigParse;

/**
 * @author Ryan
 * @version Id: JsonConfigParseFactory, v 0.1 2021/2/22 下午3:08 ryan Exp $
 */
public class JsonConfigParseFactory implements IConParFactory {

    public IRuleConfigParse createRuleParser() {
        return new JsonRuleConfigParse();
    }

    public ISystemConfigParse createSystemParser() {
        return new JsonSystemConfigParse();
    }


}