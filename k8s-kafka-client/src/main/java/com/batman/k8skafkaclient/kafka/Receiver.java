package com.batman.k8skafkaclient.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author liusongwei
 * @Title: Receiver
 * @ProjectName k8scloud
 * @Description: TODO
 * @date 2019/6/2416:47
 */
//@Component
public class Receiver {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 接受消息
     * @KafkaListener注解的参数“topics”为订阅的主题，与消息发送的主题对应
     * @param record
     */
    @KafkaListener(topics = {"topic_01"})
    public void receive(ConsumerRecord<?, ?> record) {
        logger.info("key: {}, value: {}, record: {}", record.key(), record.value(), record);
    }

}
