package com.ericsson.orchestration.solutiondevelopment.assurance.apex.response;

public class TriggerMessageResponse extends BaseDataModel {

	private ResponseData data;
	
	private ResponseStatus status;

	public ResponseData getData() {
		return data;
	}

	public void setData(ResponseData data) {
		this.data = data;
	}

	public ResponseStatus getStatus() {
		return status;
	}

	public void setStatus(ResponseStatus status) {
		this.status = status;
	}
	
}
