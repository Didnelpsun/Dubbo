// UserServiceImpl.java
package org.didnelpsun.service;

public class UserServiceImpl implements IUserService {
    @Override
    public String say(String text) {
        System.out.println(text);
        return text;
    }
}
