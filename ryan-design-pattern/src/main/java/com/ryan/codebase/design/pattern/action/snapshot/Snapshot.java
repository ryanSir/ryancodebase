package com.ryan.codebase.design.pattern.action.snapshot;

/**
 * @author Ryan
 * @version Id: Snapshot, v 0.1 2021/8/11 上午9:52 ryan Exp $
 */
public class Snapshot {

    private String text;

    public Snapshot(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }
}