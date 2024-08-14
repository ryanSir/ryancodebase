package com.ryan.codebase.design.pattern.action.visitor;

/**
 * @author Ryan
 * @version Id: PDFFile, v 0.1 2021/9/17 下午2:28 ryan Exp $
 */
public class PDFFile extends ResourceFile {

    public PDFFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    //    @Override
    //    public void extract2txt() {
    //        System.out.println("Extract PDF");
    //    }
}