package com.batman.storm2kafka.localdemo;

import org.apache.storm.task.OutputCollector;
import org.apache.storm.task.TopologyContext;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.topology.base.BaseRichBolt;
import org.apache.storm.tuple.Tuple;

import java.util.Map;

/**
 * @author liusongwei
 * @Title: CalculateFigureBolt
 * @ProjectName k8scloud
 * @Description: 自定义的bolt需要继承baserichbolt
 * @date 2019/7/1810:19
 */
public class CalculateFigureBolt extends BaseRichBolt {
    private Map map;
    private TopologyContext context;
    private OutputCollector collector;

    private int sum;

    /**
     * 是一个初始化方法，也是只会执行一次
     */
    @Override
    public void prepare(Map<String, Object> map, TopologyContext topologyContext, OutputCollector outputCollector) {
        this.map = map;
        this.context = topologyContext;
        this.collector = outputCollector;
    }

    /**
     * 这个方法也会执行很多次，只要上一个组件发射一条数据，那么这个bolt就收到这个条数据，然后调用execute方法去处理数据
     */
    @Override
    public void execute(Tuple tuple) {
        Integer num = tuple.getIntegerByField("count");
        //因为tuple其实就是一个list，list有角标，所以也可以通过脚本获取数据
        // tuple.getInteger(0)
        sum += num;
        System.out.println("和为："+sum);
        //注意：这个bolt已经是最后一个bolt了，所以就不需要向外面发射数据了，也就不用调用emit方法了。
    }

    /**
     * 注意：如果这个组件没有调用emit向外发射数据，那么这个方法就不需要实现。
     * 如果这个组件向外发射了数据，那么在这个方法内部必须要声明输出字段。
     */
    @Override
    public void declareOutputFields(OutputFieldsDeclarer outputFieldsDeclarer) {

    }
}
