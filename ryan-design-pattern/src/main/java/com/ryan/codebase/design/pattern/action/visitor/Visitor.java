package com.ryan.codebase.design.pattern.action.visitor;

/**
 * @author Ryan
 * @version Id: Visitor, v 0.1 2021/9/17 下午2:47 ryan Exp $
 */
public interface Visitor {

    void visit(PDFFile pdfFile);

    void visit(PPTFile pptFile);
}