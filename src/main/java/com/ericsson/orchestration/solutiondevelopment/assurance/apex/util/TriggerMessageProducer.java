package com.ericsson.orchestration.solutiondevelopment.assurance.apex.util;
import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

import com.ericsson.orchestration.solutiondevelopment.assurance.apex.request.TriggerMessageRequest;

import java.util.Properties;
import java.util.concurrent.ExecutionException;
 
/**
 * Producer Example in Apache Kafka
 * @author www.tutorialkart.com
 */
public class TriggerMessageProducer extends Thread {
    private final KafkaProducer <String,String > producer;
    private final String topic;
    private final Boolean isAsync;
    private final TriggerMessageRequest triggerMessage;
 
    public static final String KAFKA_SERVER_URL = "eric-data-message-bus-kf";
    public static final int KAFKA_SERVER_PORT = 9092;
    public static final String CLIENT_ID = "APIProducer";
 
    public TriggerMessageProducer(String topic, Boolean isAsync,TriggerMessageRequest trigger) {
        Properties properties = new Properties();
        triggerMessage = trigger;
        properties.put("bootstrap.servers", KAFKA_SERVER_URL + ":" + KAFKA_SERVER_PORT);
        properties.put("client.id", CLIENT_ID);
        properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        producer = new KafkaProducer<>(properties);
        this.topic = topic;
        this.isAsync = isAsync;
    }
 
    public void run() {
    	int count = 1;
        while (count <= 1) {
            String messageStr = triggerMessage.toString();
            long startTime = System.currentTimeMillis();
            if (isAsync) { // Send asynchronously
                producer.send(new ProducerRecord<>(topic,
                		Integer.toString(count),
                        messageStr), new DemoCallBack(startTime, Integer.toString(count), messageStr));
            } else { // Send synchronously
                try {
                    producer.send(new ProducerRecord<>(topic,
                    		Integer.toString(count),
                            messageStr)).get();
                    System.out.println("Sent message: (" + Integer.toString(count) + ", " + messageStr + ")");
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                    // handle the exception
                }
            }
            ++count;
        }
    }
    
}
 
class DemoCallBack implements Callback {
 
    private final long startTime;
    private final String key;
    private final String message;
 
    public DemoCallBack(long startTime, String messageNo, String message) {
        this.startTime = startTime;
        this.key = messageNo;
        this.message = message;
    }
 
    /**
     * onCompletion method will be called when the record sent to the Kafka Server has been acknowledged.
     * 
     * @param metadata  The metadata contains the partition and offset of the record. Null if an error occurred.
     * @param exception The exception thrown during processing of this record. Null if no error occurred.
     */
    public void onCompletion(RecordMetadata metadata, Exception exception) {
        long elapsedTime = System.currentTimeMillis() - startTime;
        if (metadata != null) {
            System.out.println(
                    "message(" + key + ", " + message + ") sent to partition(" + metadata.partition() +
                    "), " +
                    "offset(" + metadata.offset() + ") in " + elapsedTime + " ms");
        } else {
            exception.printStackTrace();
        }
    }
}