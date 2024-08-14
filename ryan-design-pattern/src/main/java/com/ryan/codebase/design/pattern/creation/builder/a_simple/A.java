package com.ryan.codebase.design.pattern.creation.builder.a_simple;

/**
 * @author Ryan
 * @version Id: A, v 0.1 2021/2/22 下午4:05 ryan Exp $
 */
public class A {
    public static void main(String[] args) {
        ResourcePoolConfig config = new ResourcePoolConfig("dbConnection", 16, null, null);
        // ...
    }
}