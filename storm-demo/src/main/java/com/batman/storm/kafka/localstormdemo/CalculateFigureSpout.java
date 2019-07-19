package com.batman.storm.kafka.localstormdemo;

import org.apache.storm.spout.SpoutOutputCollector;
import org.apache.storm.task.TopologyContext;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.topology.base.BaseRichSpout;
import org.apache.storm.tuple.Fields;
import org.apache.storm.tuple.Values;
import org.apache.storm.utils.Utils;

import java.util.Map;

/**
 * @author liusongwei
 * @Title: CalculateFigureSpout
 * @ProjectName k8scloud
 * @Description: 自定义的spout需要继承BaseRichSpout
 * @date 2019/7/189:50
 */
public class CalculateFigureSpout extends BaseRichSpout {
    private Map<String,Object> map;
    private TopologyContext context;
    private SpoutOutputCollector collector;

    private int count;

    /**
     * 这个方法是一个初始化方法，在spout组件初始化的时候只执行一次。
     * 所以一般会在这个方法内部实现一些初始化的代码，
     * 例子：如果需要实现对mysql的操作，需要使用连接池，那么连接池初始化的代码就需要放在open方法里面。
     *
     * Map map：其实是storm的配置类，这里面可以保存一个配置信息在storm中进行传递。
     * TopologyContext context：topology的上下文对象
     * SpoutOutputCollector collector：发射器，负责发射数据
     */
    @Override
    public void open(Map<String, Object> map, TopologyContext topologyContext, SpoutOutputCollector spoutOutputCollector) {
        this.map = map;
        this.context = topologyContext;
        this.collector = spoutOutputCollector;
    }

    /**
     * 这个方法会被框架一直调用，死循环的调用
     * spout负责在nextTuple中向外发射数据
     * 这个方法每执行一次，都会向外发射一条数据。
     */
    @Override
    public void nextTuple() {
        count++;//这样就可以产生递增的数字
        this.collector.emit(new Values(count));
        System.out.println("111111111111111111111111111111spout："+count);
        Utils.sleep(1000);
    }

    /**
     * 声明输出字段
     * 这个方法也是在开始执行一次
     */
    @Override
    public void declareOutputFields(OutputFieldsDeclarer declarer) {
        //注意：Fields中封装的字段和values中封装的数据是一一对应的
        declarer.declare(new Fields("count"));
    }
}
