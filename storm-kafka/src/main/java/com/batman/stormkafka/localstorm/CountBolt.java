package com.batman.stormkafka.localstorm;

import backtype.storm.task.OutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseRichBolt;
import backtype.storm.tuple.Tuple;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/**
 * @author liusongwei
 * @Title: CountBolt
 * @ProjectName k8scloud
 * @Description: TODO
 * @date 2019/7/1911:46
 */
public class CountBolt extends BaseRichBolt {
    private HashMap<String, Integer> wordMap = new HashMap<String, Integer>();

    @Override
    public void prepare(Map map, TopologyContext topologyContext, OutputCollector outputCollector) {

    }

    @Override
    public void execute(Tuple tuple) {
        //从tuple中读取单词
        String word = tuple.getStringByField("word");

        //计数
        int num;
        if (wordMap.containsKey(word)) {
            num = wordMap.get(word);
        } else {
            num = 0;
        }
        wordMap.put(word, 1 + num);

        //输出展示
        Set<String> keys = wordMap.keySet();
        for (String key : keys) {
            System.out.print(key + ":" + wordMap.get(key) + ",");
        }
        System.out.println();
    }

    @Override
    public void declareOutputFields(OutputFieldsDeclarer outputFieldsDeclarer) {

    }
}