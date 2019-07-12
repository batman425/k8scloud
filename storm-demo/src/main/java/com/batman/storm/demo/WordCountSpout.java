package com.batman.storm.demo;

import org.apache.storm.spout.SpoutOutputCollector;
import org.apache.storm.task.TopologyContext;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.topology.base.BaseRichSpout;
import org.apache.storm.tuple.Fields;
import org.apache.storm.tuple.Values;
import org.apache.storm.utils.Utils;

import java.util.Map;
import java.util.Random;

/**
 * @author liusongwei
 * @Title: WordCountSpout
 * @ProjectName k8scloud
 * @Description: 从外部数据源获取数据
 * @date 2019/7/99:59
 */
public class WordCountSpout extends BaseRichSpout {
    private String[] lines={"this is a demo","hello Storm","ni hao"};
    /*
     * 该类负责将数据发送给下游
     */
    private SpoutOutputCollector collector;

    /**
     * 当Spout被实例化之后，open方法会被调用一次
     */
    @Override
    public void open(Map<String, Object> conf, TopologyContext context, SpoutOutputCollector collector) {
        System.out.println("WordCountSpout print open");
        this.collector=collector;
    }
    /**
     * 这个方法做的惟一一件事情就是分发数据
     * 这个方法会被不断的调用，因为Spout需要不断的从外部数据源中获取最新的数据，然后使用SpoutOutputCollector的emit方法来进行发射
     */
    @Override
    public void nextTuple() {
        System.out.println("WordCountSpout print nextTuple");
        Utils.sleep(1000);
        String line=lines[new Random().nextInt(lines.length)];
        System.out.println("打印即将发送的源数据:" + line);
        //执行发布
        collector.emit(new Values(line));
    }
    /**
     * 对emit中的tuple做字段的描述
     * 声明数据格式，即输出的一个Tuple中，包含几个字段
     */
    @Override
    public void declareOutputFields(OutputFieldsDeclarer declarer) {
        System.out.println("WordCountSpout print declareOutputFields");
        declarer.declare(new Fields("line"));
    }
}
