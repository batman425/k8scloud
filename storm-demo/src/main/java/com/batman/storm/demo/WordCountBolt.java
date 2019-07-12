package com.batman.storm.demo;

import org.apache.storm.task.OutputCollector;
import org.apache.storm.task.TopologyContext;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.topology.base.BaseRichBolt;
import org.apache.storm.tuple.Fields;
import org.apache.storm.tuple.Tuple;
import org.apache.storm.tuple.Values;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liusongwei
 * @Title: WordCountBolt
 * @ProjectName k8scloud
 * @Description: TODO
 * @date 2019/7/99:32
 */
public class WordCountBolt extends BaseRichBolt {
    /*
    存储状态
     */
    private Map<String,Integer> keyValueState;
    /*
    该类负责将数据发送给下游
     */
    private OutputCollector collector;

    @Override
    public void prepare(Map<String, Object> topoConf, TopologyContext context, OutputCollector collector) {
        System.out.println("WordCountBolt print prepare");
        this.collector=collector;
        keyValueState=new HashMap<String, Integer>();
    }

    @Override
    public void execute(Tuple input) {
        System.out.println("WordCountBolt print execute");
        String key = input.getStringByField("word");
        int count=0;
        if(keyValueState.containsKey(key)){
            count=keyValueState.get(key);
        }
        //更新状态
        int currentCount=count+1;
        keyValueState.put(key,currentCount);
        //将最后结果输出给下游
        collector.emit(new Values(key,currentCount));
    }

    @Override
    public void declareOutputFields(OutputFieldsDeclarer declarer) {
        System.out.println("WordCountBolt print declareOutputFields");
        declarer.declare(new Fields("key","result"));
    }
}
