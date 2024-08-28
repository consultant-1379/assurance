package com.ericsson.orchestration.solutiondevelopment.assurance.apex.util;

import com.ericsson.orchestration.solutiondevelopment.assurance.apex.request.TriggerMessageRequest;

public class KafkaProducer {
    public static final String TOPIC = "Trigger";
    
    public static void run(TriggerMessageRequest triggerMessage) {
    	boolean isAsync = false;
        TriggerMessageProducer producerThread = new TriggerMessageProducer(TOPIC, isAsync,triggerMessage);
        // start the producer
        producerThread.start();
    }
}