package com.lxt.jms.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liuxutao-64
 * @create 2017-10-21 16:26
 */
public class AppConsumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");

    }
}
