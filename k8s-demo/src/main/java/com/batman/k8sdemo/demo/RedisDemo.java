package com.batman.k8sdemo.demo;

import com.batman.cowboy.redis.RedisManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liusongwei
 * @Title: RedisDemo
 * @ProjectName batman
 * @Description: TODO
 * @date 2019/6/1417:01
 */
@RestController
public class RedisDemo {
    private static Logger log = LoggerFactory.getLogger(Demo.class);

  //  @Autowired
  //  private RedisManager redisManager;

    @RequestMapping("/getValue")
    public String getValue(){
        log.info("开始加载redis");
     //   redisManager.set("applyName","大山夹在大山里面",1000);
     //   String tmp = redisManager.get("applyname");
   //     log.info("redis存放的信息{}",tmp);
        return "redis测试";
    }
}
