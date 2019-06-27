package com.batman.k8smybatis.login;

import com.batman.k8smybatis.model.Login;
import com.batman.k8smybatis.repository.LoginMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liusongwei
 * @Title: Login
 * @ProjectName k8scloud
 * @Description: TODO
 * @date 2019/6/2511:33
 */
@RestController
public class LoginA {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private LoginMapper loginMapper;

    @RequestMapping("/login")
    public String loginUser(){
        Login tlogin = loginMapper.selectByPrimaryKey(1);
        logger.info("打印查询的信息{}",tlogin);
        return "login success";
    }
}
