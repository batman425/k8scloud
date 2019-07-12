package com.batman.storm.kafkademo;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.storm.kafka.spout.DefaultRecordTranslator;
import org.apache.storm.tuple.Fields;
import org.apache.storm.tuple.Values;

import java.util.List;
/**
 * @author liusongwei
 * @Title: MyRecordTranslator
 * @ProjectName k8scloud
 * @Description: TODO
 * @date 2019/7/119:21
 */
public class MyRecordTranslator<K, V>  extends DefaultRecordTranslator<K, V> {
    @Override
    public List<Object> apply(ConsumerRecord<K, V> record) {
        return new Values(new Object[]{record.topic(),record.partition(),record.offset(),record.key(),record.value(),record.timestamp()});
    }

    @Override
    public Fields getFieldsFor(String stream) {
        return new Fields("topic","partition","offset","key","value","timestamp");
    }
}
