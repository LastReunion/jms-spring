package com.lxt.jms.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.annotation.Resource;
import javax.jms.*;

/**
 * @author liuxutao-64
 * @create 2017-10-21 15:44
 */
public class ProducerServiceImpl implements ProducerService{

    @Autowired
    JmsTemplate jmsTemplate;

    //@Resource(name = "queueDestination")
    @Resource(name = "topicDestination")
    Destination destination;

    @Override
    public void sendMessage(final String message) {
        //使用JmsTemplate发送消息
        jmsTemplate.send(destination, new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                TextMessage textMessage = session.createTextMessage(message);
                return textMessage;
            }
        });
        System.out.println("发送消息" + message);
    }
}
