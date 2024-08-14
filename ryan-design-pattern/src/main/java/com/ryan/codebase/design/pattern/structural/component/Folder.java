package com.ryan.codebase.design.pattern.structural.component;

import java.util.ArrayList;
import java.util.List;

/**
 * 文件夹
 * 
 * @author Ryan
 * @version Id: Folder, v 0.1 2020/12/8 上午9:29 ryan Exp $
 */
public class Folder extends File {

    private List<File> files;

    public Folder(String name) {
        super(name);
        files = new ArrayList<File>();
    }

    public void display() {
        for (File file : files) {
            file.display();
        }
    }

    public void add(File file) {
        files.add(file);
    }

    public void remove(File file) {
        files.remove(file);
    }

}