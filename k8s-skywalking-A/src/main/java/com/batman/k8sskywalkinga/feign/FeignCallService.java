package com.batman.k8sskywalkinga.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author liusongwei
 * @Title: FeignCallService
 * @ProjectName k8scloud
 * @Description: TODO
 * @date 2019/6/2715:27
 */
@FeignClient(value = "k8sskywalkingb")
public interface FeignCallService {
    @RequestMapping(value = "/k8sskywalkingb", method = RequestMethod.GET)
    String call(@PathVariable(value = "name") String name);
}
