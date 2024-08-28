/*------------------------------------------------------------------------------
 *******************************************************************************
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.orchestration.solutiondevelopment.assurance.apex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.ericsson.orchestration.solutiondevelopment.assurance.apex.request.*;
import com.ericsson.orchestration.solutiondevelopment.assurance.apex.response.*;
import com.ericsson.orchestration.solutiondevelopment.assurance.apex.service.*;

@RestController
@RequestMapping("sd/v1.0")
public class NbiController {
    @Autowired
    private TriggerMessageService triggerMessageService;

    @PostMapping(value = "triggerMessage/input", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<TriggerMessageResponse> sendTrigger(@RequestBody final TriggerMessageRequest triggerMessage) {
    	final TriggerMessageResponse baseResponse = triggerMessageService.sendTriggerMessage(triggerMessage);
    	if (baseResponse.getStatus().getHttpStatus() == HttpStatus.OK) {
            return new ResponseEntity<TriggerMessageResponse>((TriggerMessageResponse) baseResponse.getData().getBaseDataModel(),
                    baseResponse.getStatus().getHttpStatus());
        } else {
            return new ResponseEntity<TriggerMessageResponse>(baseResponse.getStatus().getHttpStatus());
        }
    }
}
