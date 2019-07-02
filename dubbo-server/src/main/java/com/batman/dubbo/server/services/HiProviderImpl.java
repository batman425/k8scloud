package com.batman.dubbo.server.services;

import com.alibaba.dubbo.config.annotation.Service;
import com.batman.nacos.api.HiProvider;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liusongwei
 * @Title: HiProviderImpl
 * @ProjectName k8scloud
 * @Description: TODO
 * @date 2019/7/214:55
 */
@Service
public class HiProviderImpl implements HiProvider {
    @Value("${spring.profiles.active}")
    private String env;

    @Override
    public String hello(String name) {
        System.out.println("服务端接收到信息");
        return "hi, " + name;
    }

    @Override
    public List<Map<String, String>> testMapList(Map<String, String> map) {
        List<Map<String, String>> list = new ArrayList<Map<String, String>>();
        list.add(map);
        Map<String, String> map2 = new HashMap<String, String>();
        map2.put("env", env);
        map2.put("testKey", "testValue");
        list.add(map2);
        return list;
    }
}
