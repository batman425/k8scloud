package com.batman.stormkafka.localstorm;

import backtype.storm.Config;
import backtype.storm.LocalCluster;
import backtype.storm.topology.TopologyBuilder;

/**
 * @author liusongwei
 * @Title: MainTopology
 * @ProjectName k8scloud
 * @Description: TODO
 * @date 2019/7/1911:44
 */
public class MainTopology {
    public static void main(String[] args) {
        TopologyBuilder builder = new TopologyBuilder();
        builder.setSpout("wordSpout", new WordSpout(), 1);
        builder.setBolt("countBolt", new CountBolt(), 1).shuffleGrouping("wordSpout");

        Config config = new Config();
        LocalCluster cluster = new LocalCluster();
        cluster.submitTopology("word_count", config, builder.createTopology());

        try {
            Thread.sleep(60 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        cluster.killTopology("word_count");
        cluster.shutdown();
    }
}
