/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2018
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.orchestration.solutiondevelopment.assurance.apex.util;

import org.springframework.http.HttpStatus;

import com.ericsson.orchestration.solutiondevelopment.assurance.apex.response.*;

public class Utils {
    public static TriggerMessageResponse getSuccessMessage(final BaseDataModel baseDataModel) {

        final TriggerMessageResponse baseResponse = new TriggerMessageResponse();
        final ResponseStatus responseStatus = new ResponseStatus();
        responseStatus.setHttpStatus(HttpStatus.OK);
        baseResponse.setStatus(responseStatus);

        final ResponseData responseData = new ResponseData();

        responseData.setBaseDataModel(baseDataModel);

        baseResponse.setData(responseData);

        return baseResponse;
    }
}
