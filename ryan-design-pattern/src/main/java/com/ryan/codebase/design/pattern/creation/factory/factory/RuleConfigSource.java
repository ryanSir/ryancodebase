package com.ryan.codebase.design.pattern.creation.factory.factory;

import java.util.HashMap;
import java.util.Map;

import com.ryan.codebase.design.pattern.creation.factory.IRuleConfigParse;

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

        return RuleParseFactory.get(ruleConfigFileExtension).createParse();

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

    private static class RuleParseFactory {
        private static final Map<String, IRuleConParFactory> cachedFactories = new HashMap<String, IRuleConParFactory>();

        static {
            cachedFactories.put("json", new JsonRuleConparFactory());
            cachedFactories.put("xml", new XmlRuleConparFactory());
        }

        public static IRuleConParFactory get(String type) {
            return cachedFactories.get(type);
        }
    }

}