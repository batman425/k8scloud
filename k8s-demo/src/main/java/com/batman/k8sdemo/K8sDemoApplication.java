package com.batman.k8sdemo;

import com.batman.cowboy.redis.config.RedisCacheConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author liusongwei
 * @Title: K8sDemoApplication
 * @ProjectName batman
 * @Description: TODO
 * @date 2019/6/1214:39
 */
@SpringBootApplication
@EnableDiscoveryClient
public class K8sDemoApplication {


    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(K8sDemoApplication.class, args);
        String userName = applicationContext.getEnvironment().getProperty("user.name");
        String age = applicationContext.getEnvironment().getProperty("user.age");
        System.out.println("打印出的信息为: " + userName);
        System.out.println("打印出的年龄为: " + age);
        RedisCacheConfiguration redisCacheConfiguration = new RedisCacheConfiguration("116.62.163.101",6379,10000,200,300,"Pw123456!");
    }
}
