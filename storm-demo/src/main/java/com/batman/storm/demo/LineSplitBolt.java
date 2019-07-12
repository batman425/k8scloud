package com.batman.storm.demo;

import org.apache.storm.task.OutputCollector;
import org.apache.storm.task.TopologyContext;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.topology.base.BaseRichBolt;
import org.apache.storm.tuple.Fields;
import org.apache.storm.tuple.Tuple;
import org.apache.storm.tuple.Values;

import java.util.Map;

/**
 * @author liusongwei
 * @Title: LineSplitBolt
 * @ProjectName k8scloud
 * @Description: TODO
 * @date 2019/7/99:29
 */
public class LineSplitBolt extends BaseRichBolt {
    /*
    该类负责将数据发送给下游
     */
    private OutputCollector collector;

    @Override
    public void prepare(Map<String, Object> map, TopologyContext topologyContext, OutputCollector collector) {
        System.out.println("LineSplitBolt print prepare");
        this.collector=collector;
    }

    @Override
    public void execute(Tuple input) {
        System.out.println("LineSplitBolt print execute");
        String line = input.getStringByField("line");
        System.out.println("LineSplitBolt获取到的数据为:" + line);
        String[] tokens = line.split("W+");
        for (String token : tokens) {
            collector.emit(new Values(token,1));
        }
    }

    @Override
    public void declareOutputFields(OutputFieldsDeclarer declarer) {
        System.out.println("LineSplitBolt print declareOutputFields");
        declarer.declare(new Fields("word","count"));
    }
}
