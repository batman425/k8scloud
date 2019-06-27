package com.batman.k8sskywalkingc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author liusongwei
 * @Title: K8sSkywalkingCApplication
 * @ProjectName k8scloud
 * @Description: TODO
 * @date 2019/6/2714:14
 */
@SpringBootApplication
@EnableDiscoveryClient
public class K8sSkywalkingCApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(K8sSkywalkingCApplication.class, args);
        String userName = applicationContext.getEnvironment().getProperty("user.name");
        String age = applicationContext.getEnvironment().getProperty("user.age");
        System.out.println("打印出的信息为: " + userName);
        System.out.println("打印出的年龄为: " + age);
    }
}
