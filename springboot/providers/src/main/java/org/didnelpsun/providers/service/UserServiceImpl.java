// UserServiceImpl.java
package org.didnelpsun.providers.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.didnelpsun.service.IUserService;

@DubboService
public class UserServiceImpl implements IUserService {
    @Override
    public String say(String text) {
        System.out.println(text);
        return text;
    }
}
