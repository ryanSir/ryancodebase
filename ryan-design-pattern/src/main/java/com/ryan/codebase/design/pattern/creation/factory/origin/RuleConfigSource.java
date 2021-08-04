package com.ryan.codebase.design.pattern.creation.factory.origin;


import com.ryan.codebase.design.pattern.creation.factory.IRuleConfigParse;
import com.ryan.codebase.design.pattern.creation.factory.JsonRuleConfigParse;
import com.ryan.codebase.design.pattern.creation.factory.XmlRuleConfigParse;

/**
 * 原始类
 * @author Ryan
 * @version Id: RuleConfigSource, v 0.1 2021/2/22 下午2:04 ryan Exp $
 */
public class RuleConfigSource {

    /**
     * 根据扩展名获取不同的解析器
     *
     * @param ruleConfigFilePath
     * @return
     */
    public IRuleConfigParse load(String ruleConfigFilePath) {
        // 解析文件扩展名
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);

        return getIRuleConfigParse(ruleConfigFileExtension);
    }

    /**
     * 返回具体实现类
     *
     * @param ruleConfigFileExtension
     * @return
     */
    private IRuleConfigParse getIRuleConfigParse(String ruleConfigFileExtension) {
        if ("json".equals(ruleConfigFileExtension)) {
            return new JsonRuleConfigParse();
        }
        if ("xml".equals(ruleConfigFileExtension)) {
            return new XmlRuleConfigParse();
        }
        throw new IllegalArgumentException("can not find service ");
    }

    /**
     * 解析文件扩展名
     * 
     * @param ruleConfigFilePath  xx.json/xx.xml
     * @return
     */
    private String getFileExtension(String ruleConfigFilePath) {
        // ... 省略
        return "json";
    }

}