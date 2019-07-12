package com.batman.storm.kafkademo;

import org.apache.storm.task.OutputCollector;
import org.apache.storm.task.TopologyContext;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.topology.base.BaseRichBolt;
import org.apache.storm.tuple.Tuple;

import java.util.Map;

/**
 * @author liusongwei
 * @Title: KafkaPrintBlot
 * @ProjectName k8scloud
 * @Description: TODO
 * @date 2019/7/119:27
 */
public class KafkaPrintBlot extends BaseRichBolt {
    @Override
    public void prepare(Map<String, Object> map, TopologyContext topologyContext, OutputCollector outputCollector) {
        System.out.println("WordPrintBolt print prepare");
    }

    @Override
    public void execute(Tuple input) {
        System.out.println("WordPrintBolt print execute");
        String word=input.getStringByField("key");
        Integer result=input.getIntegerByField("result");
        System.out.println(input+"	"+word+" , "+result);
    }

    @Override
    public void declareOutputFields(OutputFieldsDeclarer outputFieldsDeclarer) {
        System.out.println("WordPrintBolt print declareOutputFields");
    }
}
