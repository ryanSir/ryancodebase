package com.ryan.codebase.design.pattern.structural.proxy;

/**
 * @author Ryan
 * @version Id: IUserService, v 0.1 2020/11/20 上午10:43 ryan Exp $
 */
public class IUserService implements UserService {

    public void login(String a) {
        System.out.println("login..." + a);
    }
}