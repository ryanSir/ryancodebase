package com.ryan.codebase.design.pattern.creation.builder.b_set;


/**
 * @author Ryan
 * @version Id: A, v 0.1 2021/2/22 下午4:13 ryan Exp $
 */
public class A {

    public static void main(String[] args) {
        ResourcePoolConfig config = new ResourcePoolConfig("dbConnection");
        config.setMaxTotal(16);
        config.setMaxIdle(16);
        config.setMinIdle(8);
    }

}