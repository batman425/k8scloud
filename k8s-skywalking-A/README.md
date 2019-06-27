server:
  port: 8061
user:
  name: zhangsan1111
  age: 30
spring:
  application:
    name: k8sskywalkinga
  cloud:
    nacos:
      discovery:
        server-addr: 127.0.0.1:8848
#对外暴露该服务
management:
  endpoints:
    web:
      exposure:
        include: '*'