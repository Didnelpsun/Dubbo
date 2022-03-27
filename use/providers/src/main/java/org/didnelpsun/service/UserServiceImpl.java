// UserServiceImpl.java
package org.didnelpsun.service;

public class UserServiceImpl implements IUserService {
    @Override
    public void say(String text) {
        System.out.println(text);
    }
}
