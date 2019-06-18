package com.batman.k8seureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author liusongwei
 * @Title: K8sEurekaApplication
 * @ProjectName batman
 * @Description: TODO
 * @date 2019/6/1216:15
 */
@SpringBootApplication
@EnableEurekaServer
public class K8sEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(K8sEurekaApplication.class, args);
    }
}
