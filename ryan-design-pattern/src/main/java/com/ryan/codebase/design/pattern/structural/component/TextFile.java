package com.ryan.codebase.design.pattern.structural.component;

/**
 * @author Ryan
 * @version Id: TextFile, v 0.1 2020/12/8 上午9:34 ryan Exp $
 */
public class TextFile extends File {

    public TextFile(String name) {
        super(name);
    }

    public void display() {
        System.out.println("这是文本文件，文件名：" + super.getName());
    }
}