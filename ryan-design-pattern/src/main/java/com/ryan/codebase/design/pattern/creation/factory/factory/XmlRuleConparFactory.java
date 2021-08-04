package com.ryan.codebase.design.pattern.creation.factory.factory;

import com.ryan.codebase.design.pattern.creation.factory.IRuleConfigParse;
import com.ryan.codebase.design.pattern.creation.factory.XmlRuleConfigParse;

/**
 * @author Ryan
 * @version Id: XmlRuleConparFactory, v 0.1 2020/11/19 上午10:41 ryan Exp $
 */
public class XmlRuleConparFactory implements IRuleConParFactory {

    public IRuleConfigParse createParse() {
        return new XmlRuleConfigParse();
    }
}