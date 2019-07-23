package com.batman.kafkaprod.kafka;

import org.apache.storm.Config;
import org.apache.storm.StormSubmitter;
import org.apache.storm.generated.StormTopology;
import org.apache.storm.kafka.bolt.KafkaBolt;
import org.apache.storm.kafka.bolt.mapper.FieldNameBasedTupleToKafkaMapper;
import org.apache.storm.kafka.bolt.selector.DefaultTopicSelector;
import org.apache.storm.kafka.spout.KafkaSpout;
import org.apache.storm.kafka.spout.KafkaSpoutConfig;
import org.apache.storm.kafka.spout.KafkaSpoutRetryExponentialBackoff;
import org.apache.storm.kafka.spout.KafkaSpoutRetryService;
import org.apache.storm.topology.TopologyBuilder;
import org.apache.storm.utils.Utils;

import java.util.Properties;
import java.util.UUID;

/**
 * @author liusongwei
 * @Title: KafkaTopology
 * @ProjectName k8scloud
 * @Description: TODO
 * @date 2019/7/1916:03
 */
public class KafkaTopology {
    private static final String TOPIC_0_1_STREAM = "test_0_1_stream";

    public static void main(String[] args) throws Exception {
        new KafkaTopology().runMain(args);
    }

    protected void runMain(String[] args) throws Exception {
        final TopologyBuilder builder = new TopologyBuilder();
        builder.setSpout("spout", () -> {
            Utils.sleep(1000); //Throttle this spout a bit to avoid maxing out CPU
            return UUID.randomUUID().toString();
        });

        //set producer properties.
        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092");
        props.put("client.id", "kafka-spout-test");
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        final KafkaBolt<String, String> bolt = new KafkaBolt<String, String>()
                .withProducerProperties(props)
                .withTopicSelector(new DefaultTopicSelector("kafka-spout-test"))
                .withTupleToKafkaMapper(new FieldNameBasedTupleToKafkaMapper<>("key", "lambda"));

        builder.setBolt("forwardToKafka", bolt, 1).shuffleGrouping("spout");


        Config config = new Config();
        config.setDebug(true);

        // Producers. This is just to get some data in Kafka, normally you would be getting this data from elsewhere
        StormSubmitter.submitTopology("kafka-spout-test-producer", config, builder.createTopology());

        //Consumer. Sets up a topology that reads the given Kafka spouts and logs the received messages
        //StormSubmitter.submitTopology("storm-kafka-client-spout-test", tpConf, getTopologyKafkaSpout(getKafkaSpoutConfig(brokerUrl)));
    }

    protected StormTopology getTopologyKafkaSpout(KafkaSpoutConfig<String, String> spoutConfig) {
        //构建拓扑，相当于构建一个job
        final TopologyBuilder tp = new TopologyBuilder();
        tp.setSpout("kafka_spout", new KafkaSpout<>(spoutConfig), 1);
        tp.setBolt("kafka_bolt", new KafkaSpoutTestBolt())
                .shuffleGrouping("kafka_spout", TOPIC_0_1_STREAM);
        return tp.createTopology();
    }

    /*protected KafkaSpoutConfig<String, String> getKafkaSpoutConfig(String bootstrapServers) {
        ByTopicRecordTranslator<String, String> trans = new ByTopicRecordTranslator<>(
                (r) -> new Values(r.topic(), r.partition(), r.offset(), r.key(), r.value()),
                new Fields("topic", "partition", "offset", "key", "value"), TOPIC_0_1_STREAM);
        trans.forTopic(TOPIC_0,
                (r) -> new Values(r.topic(), r.partition(), r.offset(), r.key(), r.value()),
                new Fields("topic", "partition", "offset", "key", "value"), TOPIC_0_1_STREAM);
        return KafkaSpoutConfig.builder(bootstrapServers, new String[]{TOPIC_0})
                .setProp(ConsumerConfig.GROUP_ID_CONFIG, "kafkaSpoutTestGroup")
                .setRetry(getRetryService())
                .setRecordTranslator(trans)
                .setOffsetCommitPeriodMs(10_000)
                .setFirstPollOffsetStrategy(EARLIEST)
                .setMaxUncommittedOffsets(250)
                .build();
    }*/

    protected KafkaSpoutRetryService getRetryService() {
        return new KafkaSpoutRetryExponentialBackoff(KafkaSpoutRetryExponentialBackoff.TimeInterval.microSeconds(500),
                KafkaSpoutRetryExponentialBackoff.TimeInterval.milliSeconds(2), Integer.MAX_VALUE, KafkaSpoutRetryExponentialBackoff.TimeInterval.seconds(10));
    }
}
