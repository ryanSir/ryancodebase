package com.ryan.architect;

/**
 * @author ryan
 * @version Id: Test, v 0.1 2022/8/11 10:13 PM ryan Exp $
 */
public class Test {

    public static void main(String[] args) {
        Composite suite1 = new Composite("架构师成长直通车");
        suite1.add(new Course("单体应用"));
        suite1.add(new Course("分布式应用"));

        suite1.show();

//        Composite suite2 = new Composite("架构师");
//        suite2.add(new Course("架构设计"));
//        suite2.add(new Course("质量控制"));  1-464   3-465
//
        Composite suite3 = new Composite("架构师体系课程");
        suite3.add(suite1);
//        suite3.add(suite2);
        suite3.show();
    }
}
