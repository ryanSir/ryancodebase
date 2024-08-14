package com.ryan.codebase.design.pattern.structural.component;


/**
 * @author Ryan
 * @version Id: Client, v 0.1 2020/12/8 上午9:37 ryan Exp $
 */
public class Client {

    public static void main(String[] args) {
        // 总文件夹
        Folder zwjj = new Folder("总文件夹");
        // 向总文件夹放入三个文件
        TextFile aText = new TextFile("a.txt");
        ImageFile bImage = new ImageFile("b.jpg");
        Folder cFloder = new Folder("C文件夹");

        zwjj.add(aText);
        zwjj.add(bImage);
        zwjj.add(cFloder);
        zwjj.display();
        System.out.println("====================");

        // 向C文件夹中添加文件
        TextFile cText = new TextFile("c_1.txt");
        ImageFile cImage = new ImageFile("c_2.txt");

        cFloder.add(cText);
        cFloder.add(cImage);

        // 遍历C文件夹
        cFloder.display();

        // 删除
        cFloder.remove(cText);
        System.out.println("====================");
        zwjj.display();
    }
}