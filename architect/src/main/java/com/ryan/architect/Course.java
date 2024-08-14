package com.ryan.architect;

import lombok.AllArgsConstructor;

/**
 * @author ryan
 * @version Id: Course, v 0.1 2022/8/11 10:10 PM ryan Exp $
 */
@AllArgsConstructor
public class Course implements Component {

    private String name;

    public void add(Component c) {

    }

    public void show() {
        System.out.println("课程名称111：" + name);
    }
}
