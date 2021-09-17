package com.ryan.codebase.design.pattern.action.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ryan
 * @version Id: ToolApplication, v 0.1 2021/9/17 下午2:29 ryan Exp $
 */
public class ToolApplication {

    public static void main(String[] args) {
        Extractor extractor = new Extractor();
        List<ResourceFile> resourceFiles = listAllResourceFiles();
        for (ResourceFile resourceFile : resourceFiles) {
            // 函数重载是一种静态绑定，在编译是并不能获取对象的实际类型，而是根据声明类型执行声明类型对应的方法
            //            extractor.extract2txt(resourceFile);
            resourceFile.accept(extractor);
        }
        Compressor compressor  = new Compressor();
        for (ResourceFile resourceFile:resourceFiles){
            resourceFile.accept(compressor);
        }
    }

    private static List<ResourceFile> listAllResourceFiles() {
        List<ResourceFile> resourceFiles = new ArrayList<>();
        resourceFiles.add(new PDFFile("a.pdf"));
        resourceFiles.add(new PPTFile("b.word"));
        return resourceFiles;
    }
}