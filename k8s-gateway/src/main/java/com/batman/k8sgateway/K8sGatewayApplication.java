package com.batman.k8sgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author liusongwei
 * @Title: K8sGatewayApplication
 * @ProjectName batman
 * @Description: TODO
 * @date 2019/6/139:15
 */
@ComponentScan(basePackages = {"com.batman.k8sgateway"})
@SpringBootApplication
@EnableDiscoveryClient
public class K8sGatewayApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(K8sGatewayApplication.class, args);
        String userName = applicationContext.getEnvironment().getProperty("user.name");
        String age = applicationContext.getEnvironment().getProperty("user.age");
        System.out.println("打印出的信息为: " + userName);
        System.out.println("打印出的年龄为: " + age);
    }

}
