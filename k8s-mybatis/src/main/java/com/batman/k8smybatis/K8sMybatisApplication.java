package com.batman.k8smybatis;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @author liusongwei
 * @Title: K8sMybatisApplication
 * @ProjectName k8scloud
 * @Description: TODO
 * @date 2019/6/2510:14
 */
@SpringBootApplication
public class K8sMybatisApplication {
    public static void main(String[] args) {
        SpringApplication.run(K8sMybatisApplication.class, args);
    }
    @Bean
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource mainDataSource() {
        return DataSourceBuilder.create().type(HikariDataSource.class).build();
    }
}
