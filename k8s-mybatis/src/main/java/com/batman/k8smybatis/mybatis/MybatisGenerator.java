package com.batman.k8smybatis.mybatis;

import com.src.common.util.MybatisGeneratorUtil;
import com.src.common.util.PropertiesFileUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:sxq
 * @Date: 2019/6/23
 * @Description:
 */
public class MybatisGenerator {

    //Model + ModelExample 存放的路径和包名
    private static String targetProjectDao = "k8s-mybatis";
    private static String modelPack = "com.batman.k8smybatis.model";

    //Mapper.java + Mapper.xml 存放路径和包名
    private static String mapperPack = "com.batman.k8smybatis.mapper";
    private static String targetProjectSql = "k8s-mybatis/src/main/resources/";
    private static String sqlmapperPack = mapperPack;


    //Repository 存放的路径和包名
    private static String targetRepository = "wechat-center/wx-service";
    private static String repositoryPack = "com.src.repository";

    // 远程接口Facade 的路径和包名
    private static String targetProjectRpcApi = "wechat-center/wx-facade";
    private static String rpcPack = "com.src.rpcapi";


    // 远程接口FacadeImpl 实现类 的路径和包名
    private static String targetProjectRpcService = "wechat-center/wx-service";
    private static String rpcServerPack = "com.src.rpcapi.impl";


    //数据库名
    private static String DATABASE = "claim_oauth2_sit";
    //需要生成的数据表前缀
    private static String TABLE_PREFIX = "third_";

    //创建人
    private static String author = "src";
    private static String JDBC_DRIVER = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.driver");
    private static String JDBC_URL = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.url");
    private static String JDBC_USERNAME = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.username");
    private static String JDBC_PASSWORD = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.password");


    // 需要insert后返回主键的表配置，key:表名,value:主键名
    private static Map<String, String> LAST_INSERT_ID_TABLES = new HashMap<>();
    static {
        //TODO ..
        LAST_INSERT_ID_TABLES.put("wechat_keyword_activity", "id");
    }

    /**
     * 自动代码生成
     * @param args
     */
    public static void main(String[] args) throws Exception {

        MybatisGeneratorUtil.generator(
                null,
                false,//是否生成Facade 层
                targetProjectDao,targetProjectSql,targetProjectRpcApi,targetProjectRpcService,
                targetRepository,modelPack,mapperPack,repositoryPack,sqlmapperPack,rpcPack,rpcServerPack,
                JDBC_DRIVER,JDBC_URL,JDBC_USERNAME,JDBC_PASSWORD,
                DATABASE,TABLE_PREFIX,LAST_INSERT_ID_TABLES,author
        );


    }
}
