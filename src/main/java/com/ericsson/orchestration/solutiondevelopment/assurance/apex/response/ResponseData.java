package com.ericsson.orchestration.solutiondevelopment.assurance.apex.response;
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


public class ResponseData {

    private BaseDataModel baseDataModel;

    /**
     * @return the baseDataModel
     */
    public BaseDataModel getBaseDataModel() {
        return baseDataModel;
    }

    /**
     * @param baseDataModel
     *            the baseDataModel to set
     */
    public void setBaseDataModel(final BaseDataModel baseDataModel) {
        this.baseDataModel = baseDataModel;
    }

}
