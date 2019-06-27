package com.batman.k8sskywalkinga;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author liusongwei
 * @Title: K8sSkywalkingAApplication
 * @ProjectName k8scloud
 * @Description: TODO
 * @date 2019/6/2714:05
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class K8sSkywalkingAApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(K8sSkywalkingAApplication.class, args);
        String userName = applicationContext.getEnvironment().getProperty("user.name");
        String age = applicationContext.getEnvironment().getProperty("user.age");
        System.out.println("打印出的信息为: " + userName);
        System.out.println("打印出的年龄为: " + age);
    }
}
