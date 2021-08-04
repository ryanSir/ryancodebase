package com.ryan.codebase.design.pattern.creation.builder.c_builder;

/**
 * @author Ryan
 * @version Id: A, v 0.1 2020/10/27 下午2:27 ryan Exp $
 */
public class A {
    public static void main(String[] args) {
        ResourcePoolConfig config = new ResourcePoolConfig.ResourcePoolConfigBuilder().setName("db").setMaxTotal(16).setMaxIdle(10).setMinIdle(12).build();
        System.out.println(config);

    }
}