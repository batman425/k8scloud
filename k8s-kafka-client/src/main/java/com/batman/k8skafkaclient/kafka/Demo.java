package com.batman.k8skafkaclient.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liusongwei
 * @Title: Demo
 * @ProjectName k8scloud
 * @Description: TODO
 * @date 2019/6/2416:48
 */
@RestController
public class Demo {
    @Autowired
    private Sender sender;

    @RequestMapping("/send")
    public void send() {
        sender.send("topic_01", "hello", "world.");
    }

}
