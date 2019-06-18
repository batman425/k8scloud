package com.batman.k8sdemo.demo;

import com.batman.cowboy.common.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liusongwei
 * @Title: Demo
 * @ProjectName batman
 * @Description: TODO
 * @date 2019/6/1216:37
 */
@RestController
public class Demo {
    private static Logger log = LoggerFactory.getLogger(Demo.class);
    User user = new User();
    @RequestMapping("/demo")
    public String demo(){
        log.info("demo1234131212测试结果");
        return "恭喜你成功了";
    }


    @RequestMapping("/reference")
    public String reference(){
        log.info("begin");
        user.setName("张三");
        log.info("end");
        log.info("打印名称{}",user.getName());
        return "引用测试";
    }
}
