package com.ryan.codebase.design.pattern.creation.factory.abstra;

import com.ryan.codebase.design.pattern.creation.factory.IRuleConfigParse;
import com.ryan.codebase.design.pattern.creation.factory.XmlRuleConfigParse;

/**
 * @author Ryan
 * @version Id: XmlConfigParseFactory, v 0.1 2021/2/22 下午3:12 ryan Exp $
 */
public class XmlConfigParseFactory implements IConParFactory {
    public IRuleConfigParse createRuleParser() {
        return new XmlRuleConfigParse();
    }

    public ISystemConfigParse createSystemParser() {
        return new XmlSystemConfigParse();
    }
}