// Consumer.java
package org.didnelpsun.consumer;

import org.didnelpsun.service.IUserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumers.xml");
        IUserService userService = context.getBean("userService", IUserService.class);
        System.out.println(userService.say("DIDNELPSUN"));
    }
}
