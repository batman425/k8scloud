package com.batman.stormkafka.localstorm;

import backtype.storm.spout.SpoutOutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseRichSpout;
import backtype.storm.tuple.Fields;
import backtype.storm.tuple.Values;

import java.util.Map;
/**
 * @author liusongwei
 * @Title: WordSpout
 * @ProjectName k8scloud
 * @Description: TODO
 * @date 2019/7/1911:45
 */
public class WordSpout extends BaseRichSpout {
    private SpoutOutputCollector collector;
    private String[] words = {"hello","world","storm","study"};
    private int index = 0;

    @Override
    public void open(Map map, TopologyContext topologyContext, SpoutOutputCollector spoutOutputCollector) {
        this.collector = spoutOutputCollector;
    }

    @Override
    public void nextTuple() {
        this.collector.emit(new Values(this.words[index]));
        index++;
        if(index>=words.length){
            index = 0;
        }

        //等待500ms
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void declareOutputFields(OutputFieldsDeclarer outputFieldsDeclarer) {
        outputFieldsDeclarer.declare(new Fields("word"));
    }
}
