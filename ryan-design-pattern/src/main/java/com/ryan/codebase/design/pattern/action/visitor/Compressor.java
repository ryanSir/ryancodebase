package com.ryan.codebase.design.pattern.action.visitor;

/**
 * @author Ryan
 * @version Id: Compressor, v 0.1 2021/9/17 下午2:50 ryan Exp $
 */
public class Compressor implements Visitor {

    @Override
    public void visit(PDFFile pdfFile) {
        System.out.println("Compress PDF");
    }

    @Override
    public void visit(PPTFile pptFile) {
        System.out.println("Compress PPT");
    }
}