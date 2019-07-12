package com.batman.storm.demo;

import org.apache.storm.Config;
import org.apache.storm.StormSubmitter;
import org.apache.storm.topology.TopologyBuilder;
import org.apache.storm.tuple.Fields;
/**
 * @author liusongwei
 * @Title: WordCountTopology
 * @ProjectName k8scloud
 * @Description: TODO
 * @date 2019/7/99:53
 */
public class WordCountTopology {
    public static void main(String[] args) throws Exception {
        //1.创建TopologyBuilder
        TopologyBuilder builder = new TopologyBuilder();

        //2.编织流处理逻辑- 重点（Spout、Bolt、连接方式）

        builder.setSpout("WordCountSpout",new WordCountSpout(),1);

        /**
         * 设置 LineSplitBolt 接收上游数据通过 随机
         */
        builder.setBolt("LineSplitBolt",new LineSplitBolt(),3)
                .shuffleGrouping("WordCountSpout");

        builder.setBolt("WordCountBolt",new WordCountBolt(),3)
                .fieldsGrouping("LineSplitBolt",new Fields("word"));

        builder.setBolt("WordPrintBolt",new WordPrintBolt(),4)
                .fieldsGrouping("WordCountBolt",new Fields("key"));

        /**
        3.提交流计算
         */
        Config conf= new Config();
        //设置Topology运行所需的Worker资源，JVM个数
        conf.setNumWorkers(1);
        //关闭Storm应答，可靠性有关
        conf.setNumAckers(0);
        StormSubmitter.submitTopology("worldcount",conf,builder.createTopology());
    }
}
