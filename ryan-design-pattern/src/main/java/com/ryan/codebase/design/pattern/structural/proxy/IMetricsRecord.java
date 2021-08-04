package com.ryan.codebase.design.pattern.structural.proxy;

/**
 * @author Ryan
 * @version Id: IMetricsRecord, v 0.1 2020/11/20 上午10:46 ryan Exp $
 */
public class IMetricsRecord implements MetricsRecord {

    public void record() {
        System.out.println("record ...");
    }
}