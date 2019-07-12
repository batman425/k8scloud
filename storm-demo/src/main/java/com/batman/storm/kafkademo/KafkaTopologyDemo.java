package com.batman.storm.kafkademo;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.storm.Config;
import org.apache.storm.LocalCluster;
import org.apache.storm.kafka.spout.FirstPollOffsetStrategy;
import org.apache.storm.kafka.spout.KafkaSpout;
import org.apache.storm.kafka.spout.KafkaSpoutConfig;
import org.apache.storm.topology.TopologyBuilder;
import org.apache.storm.utils.Utils;

/**
 * @author liusongwei
 * @Title: KafkaTopologyDemo
 * @ProjectName k8scloud
 * @Description: TODO
 * @date 2019/7/1016:16
 */
public class KafkaTopologyDemo {
    public static void main(String[] args) throws Exception {
        TopologyBuilder topologyBuilder = new TopologyBuilder();

        String boostrapServers="101.37.66.105:9092";
        String topic="topic_01";
        /**
         * 构造kafkaSpoutConfigBuilder构造器
         *
         * bootstrapServers:    Kafka链接地址 ip:port
         * topic: 主题名称
         */
        //使用kafkaSpoutConfigBuilder构造器构造kafkaSpoutConfig,并配置相应属性
        KafkaSpoutConfig<String,String> kafkaspoutConfig= KafkaSpoutConfig.builder(boostrapServers,topic)
                /**
                 * 主题key的反序列化
                 */
                .setProp(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,"org.apache.kafka.common.serialization.StringDeserializer")

                /**
                 * 主题的value的反序列化
                 */
                .setProp(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,"org.apache.kafka.common.serialization.StringDeserializer")
                /**
                 * 设置groupId
                 */
                .setProp(ConsumerConfig.GROUP_ID_CONFIG, topic.toLowerCase() + "test-consumer-group")

                /**
                 * 设置session超时时间,该值应介于
                 * [group.min.session.timeout.ms, group.max.session.timeout.ms] [6000,300000]
                 * 默认值:10000
                 */
                .setProp(ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG, "100000")

                /**
                 * 设置拉取最大容量
                 */
                .setProp(ConsumerConfig.MAX_PARTITION_FETCH_BYTES_CONFIG, "1048576")

                /**
                 * 设置控制客户端等待请求响应的最大时间量
                 * 默认值:30000
                 */
                .setProp(ConsumerConfig.REQUEST_TIMEOUT_MS_CONFIG, "300000")

                /**
                 * 设置心跳到消费者协调器之间的预期时间。
                 * 心跳用于确保消费者的会话保持活动并且当新消费者加入或离开组时促进重新平衡
                 * 默认值:	3000        (一般设置低于session.timeout.ms的三分之一)
                 */
                .setProp(ConsumerConfig.HEARTBEAT_INTERVAL_MS_CONFIG, "30000")

                /**
                 * 设置offset提交时间15s  默认30s
                 */
                .setOffsetCommitPeriodMs(30000)

                /**
                 * 设置拉取策略
                 */
                .setFirstPollOffsetStrategy(FirstPollOffsetStrategy.EARLIEST)

                /**
                 * 一旦分区积压有10个未提交offset，Spout停止poll数据，解决Storm背压问题
                 */
                .setMaxUncommittedOffsets(10)

                 .setEmitNullTuples(false)

                /**
                 * 构造kafkaSpoutConfig
                 */
                .build();

        //setSpout
        topologyBuilder.setSpout("kafkaSpout",new KafkaSpout(kafkaspoutConfig));

        //setbolt
        topologyBuilder.setBolt("KafkaSpoutBolt", new KafkaSpoutBolt()).localOrShuffleGrouping("kafkaSpout");

        Config config = new Config();
        /**
         * 设置supervisor和worker之间的通信超时时间.
         * 超过这个时间supervisor会重启worker  (秒)
         */
        config.put("supervisor.worker.timeout.secs",600000);
        /**
         * 设置storm和zookeeper之间的超时时间.
         */
        config.put("storm.zookeeper.session.timeout",1200000000);
        /**
         * 设置debug模式 日志输出更全
         * 只能在本地LocalCluster模式下启用
         */
        config.setDebug(false);
        LocalCluster localCluster = new LocalCluster();
        localCluster.submitTopology("KafkaTopologyDemo", config, topologyBuilder.createTopology());
        Utils.sleep(Long.MAX_VALUE);
        localCluster.shutdown();
        /*KafkaSpout<String, String> kafkaSpout = buildKafkaSpout(boostrapServers,topic);

        //默认输出的Tuple格式 new Fields(new String[]{'topic', 'partition', 'offset', 'key', 'value'});
        builder.setSpout("KafkaSpout",kafkaSpout,1);

        builder.setBolt("KafkaPrintBlot",new KafkaPrintBlot(),3)
                .shuffleGrouping("KafkaSpout");


        Config conf = new Config();
        //设置Topology运行所需的Worker资源，JVM个数
        conf.setNumWorkers(1);
        LocalCluster cluster = new LocalCluster();
        cluster.submitTopology("kafkaspout",conf,builder.createTopology());*/
    }
    /*public static KafkaSpout<String, String> buildKafkaSpout(String boostrapServers, String topic){

        KafkaSpoutConfig<String,String> kafkaspoutConfig= KafkaSpoutConfig.builder(boostrapServers,topic)
                .setProp(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,"org.apache.kafka.common.serialization.StringDeserializer")
                .setProp(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,"org.apache.kafka.common.serialization.StringDeserializer")
                .setProp(ConsumerConfig.GROUP_ID_CONFIG,"g1")
                .setEmitNullTuples(false)
                .setFirstPollOffsetStrategy(FirstPollOffsetStrategy.LATEST)
                .setProcessingGuarantee(KafkaSpoutConfig.ProcessingGuarantee.AT_LEAST_ONCE)
                .setMaxUncommittedOffsets(10)//一旦分区积压有10个未提交offset，Spout停止poll数据，解决Storm背压问题
                .setRecordTranslator(new MyRecordTranslator<String, String>())
                .build();
        return new KafkaSpout<String, String>(kafkaspoutConfig);
    }*/
}
