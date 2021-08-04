package com.ryan.codebase.design.pattern.creation.builder.b_set;


import org.apache.commons.lang3.StringUtils;

/**
 * 
 * @author Ryan
 * @version Id: ResourcePoolConfig, v 0.1 2021/2/22 下午3:56 ryan Exp $
 */
public class ResourcePoolConfig {

    private static final int DEFAULT_MAX_TOTAL = 8;
    private static final int DEFAULT_MAX_IDLE  = 8;
    private static final int DEFAULT_MIN_IDLE  = 0;

    private String           name;
    private int              maxTotal          = DEFAULT_MAX_TOTAL;
    private int              maxIdle           = DEFAULT_MAX_IDLE;
    private int              minIdle           = DEFAULT_MIN_IDLE;

    public ResourcePoolConfig(String name) {
        if (StringUtils.isBlank(name)) {
            throw new IllegalArgumentException("name should not be empty");
        }
        this.name = name;

    }

    /**
     * Setter method for property <tt>maxTotal</tt>.
     *
     * @param maxTotal value to be assigned to property maxTotal
     */
    public void setMaxTotal(int maxTotal) {
        this.maxTotal = maxTotal;
    }

    /**
     * Setter method for property <tt>maxIdle</tt>.
     *
     * @param maxIdle value to be assigned to property maxIdle
     */
    public void setMaxIdle(int maxIdle) {
        this.maxIdle = maxIdle;
    }

    /**
     * Setter method for property <tt>minIdle</tt>.
     *
     * @param minIdle value to be assigned to property minIdle
     */
    public void setMinIdle(int minIdle) {
        this.minIdle = minIdle;
    }

    /**
     * Getter method for property <tt>name</tt>.
     *
     * @return property value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Getter method for property <tt>maxTotal</tt>.
     *
     * @return property value of maxTotal
     */
    public int getMaxTotal() {
        return maxTotal;
    }

    /**
     * Getter method for property <tt>maxIdle</tt>.
     *
     * @return property value of maxIdle
     */
    public int getMaxIdle() {
        return maxIdle;
    }

    /**
     * Getter method for property <tt>minIdle</tt>.
     *
     * @return property value of minIdle
     */
    public int getMinIdle() {
        return minIdle;
    }
}