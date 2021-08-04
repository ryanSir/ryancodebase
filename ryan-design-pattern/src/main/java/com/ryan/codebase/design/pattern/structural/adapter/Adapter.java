package com.ryan.codebase.design.pattern.structural.adapter;

/**
 * @author Ryan
 * @version Id: TypeCAdapter, v 0.1 2021/6/16 下午3:25 ryan Exp $
 */
public class Adapter implements TypeC {

    private Usb usb;

    public Adapter(Usb usb) {
        this.usb = usb;
    }

    public void typeC() {
        usb.usb();
    }
}