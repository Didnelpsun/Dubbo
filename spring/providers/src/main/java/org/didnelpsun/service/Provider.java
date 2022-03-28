// Provider.java
package org.didnelpsun.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.IOException;

public class Provider {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("providers.xml");
        context.start();
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
