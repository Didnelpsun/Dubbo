// UserController.java
package org.didnelpsun.consumers.org.didnelpsun.consumers.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.didnelpsun.service.IUserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    // 通过注解获取服务代理
    @DubboReference
    private IUserService userService;
    @RequestMapping("/say/{text}")
    public String say(@PathVariable String text){
        return userService.say(text);
    }
}
