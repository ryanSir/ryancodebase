package com.ryan.codebase.design.pattern.creation.builder.c_builder;

import org.apache.commons.lang3.StringUtils;

/**
 * @author Ryan
 * @version Id: ResourcePoolConfig, v 0.1 2020/10/27 下午1:42 ryan Exp $
 */
public class ResourcePoolConfig {

    private String name;

    private int    maxTotal;

    private int    maxIdle;

    private int    minIdle;

    private ResourcePoolConfig(ResourcePoolConfigBuilder builder) {
        this.name = builder.name;
        this.maxTotal = builder.maxTotal;
        this.maxIdle = builder.maxIdle;
        this.minIdle = builder.minIdle;
    }

    public static class ResourcePoolConfigBuilder {

        private static final int DEFAULT_MAX_TOTAL = 8;

        private static final int DEFAULT_MAX_IDLE  = 8;

        private static final int DEFAULT_MIN_IDLE  = 0;

        private String           name;

        private int              maxTotal          = DEFAULT_MAX_TOTAL;

        private int              maxIdle           = DEFAULT_MAX_IDLE;

        private int              minIdle           = DEFAULT_MIN_IDLE;

        public ResourcePoolConfig build() {
            // 校验逻辑放到这里来，包括必填项校验，依赖关系校验，约束条件校验等
            if (StringUtils.isBlank(name)) {
                throw new IllegalArgumentException("name empty");
            }
            if (maxIdle > maxTotal) {
                throw new IllegalArgumentException("...");
            }
            return new ResourcePoolConfig(this);
        }

        public ResourcePoolConfigBuilder setName(String name) {
            if (StringUtils.isBlank(name)) {
                throw new IllegalArgumentException("...");
            }
            this.name = name;
            return this;
        }

        public ResourcePoolConfigBuilder setMaxTotal(int maxTotal) {
            if (maxTotal < 0) {
                throw new IllegalArgumentException("...");
            }
            this.maxTotal = maxTotal;
            return this;
        }

        public ResourcePoolConfigBuilder setMaxIdle(int maxIdle) {
            if (maxIdle < 0) {
                throw new IllegalArgumentException("...");
            }
            this.maxIdle = maxIdle;
            return this;
        }

        public ResourcePoolConfigBuilder setMinIdle(int minIdle) {
            if (minIdle < 0) {
                throw new IllegalArgumentException("...");
            }
            this.minIdle = minIdle;
            return this;
        }

    }

}