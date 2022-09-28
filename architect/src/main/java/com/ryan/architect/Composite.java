package com.ryan.architect;

import com.sun.istack.internal.NotNull;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ryan
 * @version Id: Composite, v 0.1 2022/8/11 10:12 PM ryan Exp $
 */
@RequiredArgsConstructor
public class Composite implements Component {

    private List<Component> components = new ArrayList<>();

    @NotNull
    private String          name;

    public void add(Component c) {
        components.add(c);
    }

    public void show() {
        System.out.println("\n系列课程名称：" + name);
        System.out.println("--------------");
        for (Component component : components) {
            component.show();
        }
    }

}
