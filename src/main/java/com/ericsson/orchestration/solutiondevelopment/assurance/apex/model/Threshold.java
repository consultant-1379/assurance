package com.ericsson.orchestration.solutiondevelopment.assurance.apex.model;

public class Threshold {

	private String meterName;
	private String threshold;
	private String meterValue;
	public String getMeterName() {
		return meterName;
	}
	public void setMeterName(String meterName) {
		this.meterName = meterName;
	}
	public String getThreshold() {
		return threshold;
	}
	public void setThreshold(String threshold) {
		this.threshold = threshold;
	}
	public String getMeterValue() {
		return meterValue;
	}
	public void setMeterValue(String meterValue) {
		this.meterValue = meterValue;
	}
	
	
}
