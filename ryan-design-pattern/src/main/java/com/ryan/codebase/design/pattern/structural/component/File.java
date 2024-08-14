package com.ryan.codebase.design.pattern.structural.component;

/**
 * @author Ryan
 * @version Id: File, v 0.1 2020/12/8 上午9:27 ryan Exp $
 */
public abstract class File {

    private String name;

    public File(String name) {
        this.name = name;
    }

    public abstract void display();

    /**
     * Getter method for property <tt>name</tt>.
     *
     * @return property value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for property <tt>name</tt>.
     *
     * @param name value to be assigned to property name
     */
    public void setName(String name) {
        this.name = name;
    }
}