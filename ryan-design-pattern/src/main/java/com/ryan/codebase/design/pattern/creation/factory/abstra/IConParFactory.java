package com.ryan.codebase.design.pattern.creation.factory.abstra;

import com.ryan.codebase.design.pattern.creation.factory.IRuleConfigParse;

/**
 * @author Ryan
 * @version Id: IRuleConParFactory, v 0.1 2020/11/19 上午10:40 ryan Exp $
 */
public interface IConParFactory {

    IRuleConfigParse createRuleParser();

    ISystemConfigParse createSystemParser();

    // 此处可以扩展新的parse类型

}
