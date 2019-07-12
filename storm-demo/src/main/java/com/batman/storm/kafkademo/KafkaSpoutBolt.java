package com.batman.storm.kafkademo;

import org.apache.storm.topology.BasicOutputCollector;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.topology.base.BaseBasicBolt;
import org.apache.storm.tuple.Tuple;

/**
 * @author liusongwei
 * @Title: KafkaSpoutBolt
 * @ProjectName k8scloud
 * @Description: TODO
 * @date 2019/7/1210:38
 */
public class KafkaSpoutBolt extends BaseBasicBolt {
    @Override
    public void execute(Tuple tuple, BasicOutputCollector basicOutputCollector) {
        //只做一个输出
        String string = tuple.getString(0);
        System.out.println(string);
    }

    @Override
    public void declareOutputFields(OutputFieldsDeclarer outputFieldsDeclarer) {

    }
}