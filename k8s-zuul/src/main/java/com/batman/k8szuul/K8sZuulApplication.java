package com.batman.k8szuul;

import com.batman.k8szuul.filter.PreFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author liusongwei
 * @Title: K8sZuulApplication
 * @ProjectName batman
 * @Description: TODO
 * @date 2019/6/1214:26
 */
@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class K8sZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(K8sZuulApplication.class, args);
    }
    // 配置过滤器
    @Bean
    public PreFilter accessTokenCheck() {
        return new PreFilter();
    }

    @Configuration
    public static class SecurityPermitAllConfig extends WebSecurityConfigurerAdapter {
        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.authorizeRequests().anyRequest().permitAll()
                    .and().csrf().disable();
        }
    }
}
