package com.batman.nacos.api;

import java.util.List;
import java.util.Map;

/**
 * @author liusongwei
 * @Title: HiProvider
 * @ProjectName k8scloud
 * @Description: TODO
 * @date 2019/7/214:47
 */
public interface HiProvider {
    String hello(String name);

    List<Map<String, String>> testMapList(Map<String, String> map);
}
