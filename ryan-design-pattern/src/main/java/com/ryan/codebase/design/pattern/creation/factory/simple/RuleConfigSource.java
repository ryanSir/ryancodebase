package com.ryan.codebase.design.pattern.creation.factory.simple;


import com.ryan.codebase.design.pattern.creation.factory.IRuleConfigParse;

/**
 * 简单工厂运用
 *
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

        return RuleConfigParseFactory.createParse(ruleConfigFileExtension);

    }


    /**
     * 解析文件扩展名
     * 
     * @param ruleConfigFilePath
     * @return
     */
    private String getFileExtension(String ruleConfigFilePath) {
        // ... 省略
        return "json";
    }

}