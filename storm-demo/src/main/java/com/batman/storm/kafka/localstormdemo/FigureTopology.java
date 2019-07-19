package com.batman.storm.kafka.localstormdemo;

import org.apache.storm.Config;

import org.apache.storm.LocalCluster;
import org.apache.storm.topology.TopologyBuilder;

/**
 * @author liusongwei
 * @Title: FigureTopology
 * @ProjectName k8scloud
 * @Description: TODO
 * @date 2019/7/1810:30
 */
public class FigureTopology {
    public static void main(String[] args) throws Exception{
        //把spout和bolt组装成一个topology去执行
        /*TopologyBuilder topologyBuilder = new TopologyBuilder();
        topologyBuilder.setSpout("spoutid", new CalculateFigureSpout());
        topologyBuilder.setBolt("boltid", new CalculateFigureBolt()).shuffleGrouping("spoutid");

        //创建本地集群
        LocalCluster localCluster = new LocalCluster();
        //拓扑的名称
        String simpleName = LocalCluster.LocalTopology.class.getSimpleName();
        System.out.println("打印拓扑的名稱：" + simpleName);
        //配置类
        Config config = new Config();
        localCluster.submitTopology(simpleName, config, topologyBuilder.createTopology());*/
    }
}
