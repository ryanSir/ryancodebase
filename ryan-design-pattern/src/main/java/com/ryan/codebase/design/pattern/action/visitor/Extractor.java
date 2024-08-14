package com.ryan.codebase.design.pattern.action.visitor;

/**
 * @author Ryan
 * @version Id: Extractor, v 0.1 2021/9/17 下午2:35 ryan Exp $
 */
public class Extractor implements Visitor {

    @Override
    public void visit(PDFFile pdfFile) {
        System.out.println("Extract PDF");
    }

    @Override
    public void visit(PPTFile pptFile) {
        System.out.println("Extract PPT");
    }
}