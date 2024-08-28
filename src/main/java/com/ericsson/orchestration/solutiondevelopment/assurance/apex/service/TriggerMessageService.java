package com.ericsson.orchestration.solutiondevelopment.assurance.apex.service;

import com.ericsson.orchestration.solutiondevelopment.assurance.apex.request.TriggerMessageRequest;
import com.ericsson.orchestration.solutiondevelopment.assurance.apex.response.TriggerMessageResponse;

public interface TriggerMessageService {

	TriggerMessageResponse sendTriggerMessage(final TriggerMessageRequest triggerMessage);
}
