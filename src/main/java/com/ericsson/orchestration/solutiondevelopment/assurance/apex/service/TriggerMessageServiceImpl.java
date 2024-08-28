package com.ericsson.orchestration.solutiondevelopment.assurance.apex.service;

import org.springframework.stereotype.Service;

import com.ericsson.orchestration.solutiondevelopment.assurance.apex.request.TriggerMessageRequest;
import com.ericsson.orchestration.solutiondevelopment.assurance.apex.response.TriggerMessageResponse;
import com.ericsson.orchestration.solutiondevelopment.assurance.apex.util.KafkaProducer;
import com.ericsson.orchestration.solutiondevelopment.assurance.apex.util.Utils;

@Service("triggerMessageService")
public class TriggerMessageServiceImpl implements TriggerMessageService {

	@Override
	public TriggerMessageResponse sendTriggerMessage(TriggerMessageRequest triggerMessage) {
		KafkaProducer.run(triggerMessage);
		final TriggerMessageResponse triggerMessageResponse = new TriggerMessageResponse();
		return Utils.getSuccessMessage(triggerMessageResponse);
	}
}
