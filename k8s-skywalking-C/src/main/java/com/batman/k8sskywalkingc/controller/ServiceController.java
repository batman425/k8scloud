package com.batman.k8sskywalkingc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liusongwei
 * @Title: ServiceController
 * @ProjectName k8scloud
 * @Description: TODO
 * @date 2019/6/2714:18
 */
@RestController
public class ServiceController {
    private static Logger log = LoggerFactory.getLogger(ServiceController.class);

    @RequestMapping("/k8sskywalkingc")
    public String Hello(String name){
        log.info("shanghai welcome to you. {}",name);
        return "welcome to " + name;
    }
}
