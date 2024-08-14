package com.ryan.codebase.design.pattern.structural.component;

/**
 * @author Ryan
 * @version Id: ImageFile, v 0.1 2020/12/8 上午9:35 ryan Exp $
 */
public class ImageFile extends File {

    public ImageFile(String name) {
        super(name);
    }

    public void display() {
        System.out.println("这是图像文件，文件名：" + super.getName());
    }
}