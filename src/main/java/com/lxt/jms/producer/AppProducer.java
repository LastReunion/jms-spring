package com.lxt.jms.producer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liuxutao-64
 * @create 2017-10-21 15:57
 *
 * https://github.com/jovezhao/nest/tree/master/nest-ddd
 */
public class AppProducer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("producer.xml");
        ProducerService service = context.getBean(ProducerService.class);
        for (int i=0;i<100;i++){
            service.sendMessage("test" + i);
        }
        context.close();
    }
}
