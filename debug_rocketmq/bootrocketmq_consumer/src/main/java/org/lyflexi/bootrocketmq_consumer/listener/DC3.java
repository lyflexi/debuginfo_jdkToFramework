package org.lyflexi.bootrocketmq_consumer.listener;

import org.apache.rocketmq.spring.annotation.MessageModel;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

/**
 * @Author: DLJD
 * @Date: 2023/4/22
 */
@Component
@RocketMQMessageListener(topic = "modeTopic",
        consumerGroup = "mode-consumer-group-a",
        messageModel = MessageModel.CLUSTERING // 集群模式
)
public class DC3 implements RocketMQListener<String> {
    @Override
    public void onMessage(String message) {
        System.out.println("我是mode-consumer-group-a组的第三个消费者:" + message);

    }


}
