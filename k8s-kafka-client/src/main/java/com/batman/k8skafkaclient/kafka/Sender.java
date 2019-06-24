package com.batman.k8skafkaclient.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;

/**
 * @author liusongwei
 * @Title: Sender
 * @ProjectName k8scloud
 * @Description: TODO
 * @date 2019/6/2416:46
 */
@Component
public class Sender {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    /**
     * 发送消息
     * @param topic
     * @param key
     * @param message
     */
    public void send(String topic, String key, String message) {
        ListenableFuture<SendResult<String, String>> future = kafkaTemplate.send(topic, key, message);
        //发送成功及发送失败的回调
        future.addCallback(result -> logger.info("发送成功：{}", result), ex -> logger.debug("发送失败：{}", ex));
    }
}
