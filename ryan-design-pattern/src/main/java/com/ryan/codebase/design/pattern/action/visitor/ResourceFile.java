package com.ryan.codebase.design.pattern.action.visitor;

/**
 * @author Ryan
 * @version Id: ResrouceFile, v 0.1 2021/9/17 下午2:26 ryan Exp $
 */
public abstract class ResourceFile {

    protected String filePath;

    public ResourceFile(String filePath) {
        this.filePath = filePath;
    }

    abstract public void accept(Visitor visitor);

    //    public abstract void extract2txt();
}
