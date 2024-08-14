package com.ryan.codebase.design.pattern.action.visitor;

/**
 * @author Ryan
 * @version Id: PPTFile, v 0.1 2021/9/17 下午2:27 ryan Exp $
 */
public class PPTFile extends ResourceFile {

    public PPTFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    //    @Override
    //    public void extract2txt() {
    //        System.out.println("Extract PPT");
    //    }
}