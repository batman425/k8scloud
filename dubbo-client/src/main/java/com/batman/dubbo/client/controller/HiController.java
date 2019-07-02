package com.batman.dubbo.client.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.batman.nacos.api.HiProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liusongwei
 * @Title: HiController
 * @ProjectName k8scloud
 * @Description: TODO
 * @date 2019/7/215:16
 */
@RestController
public class HiController {
    @Reference
    HiProvider hiProvider;

    @GetMapping(value = "/api/hello")
    @ResponseBody
    public String index(@RequestParam("name") String name){
        System.out.println("打印输出信息");
        return hiProvider.hello(name);
    }

    @GetMapping(value = "/api/testMapList")
    @ResponseBody
    public List<Map<String, String>> testMapList(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("hello", "nacos-dubbo");
        return hiProvider.testMapList(map);
    }
}
