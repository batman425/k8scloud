package com.batman.cowboy.redis.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @author liusongwei
 * @Title: RedisCacheConfiguration
 * @ProjectName
 * @Description: TODO
 * @date 2018/11/2010:19
 */
//@Configuration
@EnableCaching
public class RedisCacheConfiguration extends CachingConfigurerSupport {
    private static Logger logger = LoggerFactory.getLogger(RedisCacheConfiguration.class);

    //@Value("${spring.redis.host}")
    private String host;

    //@Value("${spring.redis.port}")
    private int port;

    //@Value("${spring.redis.timeout}")
    private int timeout;

    //@Value("${spring.redis.jedis.pool.max-idle}")
    private int maxIdle;

    //@Value("${spring.redis.jedis.pool.max-total}")
    private int maxTotal;

    //@Value("${spring.redis.password}")
    private String password;

    public RedisCacheConfiguration(String host,int port,int timeout,int maxIdle,int maxTotal,String password){
        this.host = host;
        this.port = port;
        this.timeout = timeout;
        this.maxIdle = maxIdle;
        this.maxTotal = maxTotal;
        this.password = password;
    }

    @Bean
    public JedisPool redisPoolFactory() {
        logger.info("JedisPool注入成功 redis地址：" + host + ":" + port);
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        //最大空闲连接数, 应用自己评估，不要超过ApsaraDB for Redis每个实例最大的连接数
        jedisPoolConfig.setMaxIdle(maxIdle);
        //最大连接数, 应用自己评估，不要超过ApsaraDB for Redis每个实例最大的连接数
        jedisPoolConfig.setMaxTotal(maxTotal);
        jedisPoolConfig.setTestOnBorrow(true);
        jedisPoolConfig.setTestOnReturn(true);

        /* 性能测试优化新增redis配置*/
        jedisPoolConfig.setMinIdle(20);//设置最小空闲数
        jedisPoolConfig.setMaxWaitMillis(10000);
        //Idle时进行连接扫描
        jedisPoolConfig.setTestWhileIdle(true);
        //表示idle object evitor两次扫描之间要sleep的毫秒数
        jedisPoolConfig.setTimeBetweenEvictionRunsMillis(30000);
        //表示idle object evitor每次扫描的最多的对象数
        jedisPoolConfig.setNumTestsPerEvictionRun(10);
        //表示一个对象至少停留在idle状态的最短时间，然后才能被idle object evitor扫描并驱逐；这一项只有在timeBetweenEvictionRunsMillis大于0时才有意义
        jedisPoolConfig.setMinEvictableIdleTimeMillis(60000);

        JedisPool pool = new JedisPool(jedisPoolConfig, host, port, timeout, password);
        return pool;
    }
}
