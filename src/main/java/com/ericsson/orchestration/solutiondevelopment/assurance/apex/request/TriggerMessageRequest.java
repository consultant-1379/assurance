package com.ericsson.orchestration.solutiondevelopment.assurance.apex.request;

import org.json.JSONException;
import org.json.JSONObject;

import com.ericsson.orchestration.solutiondevelopment.assurance.apex.model.AffectedObjects;
import com.ericsson.orchestration.solutiondevelopment.assurance.apex.model.Threshold;

public class TriggerMessageRequest {
	
	private String name;
	private String nameSpace;
	private String version;
	private String source;
	private String target;
	private String eventTimeStamp;
	private String eventType;
	private String faultAssetType;
	private String faultAssetName;
	private String faultAssetId;
	private String severity;
	private String probableCause;
	private String additionalText;
	private String tenantName;
	private String subtenantName;
	private String vdcName;
	private String vdcId;
	private Threshold[] threshold;
	private AffectedObjects[] affectedObjects;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameSpace() {
		return nameSpace;
	}

	public void setNameSpace(String nameSpace) {
		this.nameSpace = nameSpace;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getEventTimeStamp() {
		return eventTimeStamp;
	}

	public void setEventTimeStamp(String eventTimeStamp) {
		this.eventTimeStamp = eventTimeStamp;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getFaultAssetType() {
		return faultAssetType;
	}

	public void setFaultAssetType(String faultAssetType) {
		this.faultAssetType = faultAssetType;
	}

	public String getFaultAssetName() {
		return faultAssetName;
	}

	public void setFaultAssetName(String faultAssetName) {
		this.faultAssetName = faultAssetName;
	}

	public String getFaultAssetId() {
		return faultAssetId;
	}

	public void setFaultAssetId(String faultAssetId) {
		this.faultAssetId = faultAssetId;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getProbableCause() {
		return probableCause;
	}

	public void setProbableCause(String probableCause) {
		this.probableCause = probableCause;
	}

	public String getAdditionalText() {
		return additionalText;
	}

	public void setAdditionalText(String additionalText) {
		this.additionalText = additionalText;
	}

	public String getTenantName() {
		return tenantName;
	}

	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}

	public String getSubtenantName() {
		return subtenantName;
	}

	public void setSubtenantName(String subtenantName) {
		this.subtenantName = subtenantName;
	}

	public String getVdcName() {
		return vdcName;
	}

	public void setVdcName(String vdcName) {
		this.vdcName = vdcName;
	}

	public String getVdcId() {
		return vdcId;
	}

	public void setVdcId(String vdcId) {
		this.vdcId = vdcId;
	}

	public Threshold[] getThreshold() {
		return threshold;
	}

	public void setThreshold(Threshold[] threshold) {
		this.threshold = threshold;
	}

	public AffectedObjects[] getAffectedObjects() {
		return affectedObjects;
	}

	public void setAffectedObjects(AffectedObjects[] affectedObjects) {
		this.affectedObjects = affectedObjects;
	}

	@Override
	public String toString() {
		JSONObject json = new JSONObject();
		try {
			return json
			.put("name", this.getName())
			.put("nameSpace", this.getNameSpace())
			.put("version", this.getVersion())
			.put("source", this.getSource())
			.put("target", this.getTarget())
			.put("eventTimeStamp", this.getEventTimeStamp())
			.put("eventType", this.getEventType())
			.put("faultAssetType", this.getFaultAssetType())
			.put("faultAssetName",this.getFaultAssetName())
			.put("faultAssetId", this.getFaultAssetId())
			.put("severity", this.getSeverity())
			.put("probableCause", this.getProbableCause())
			.put("additionalText", this.getAdditionalText())
			.put("tenantName", this.getTenantName())
			.put("subtenantName", this.getSubtenantName())
			.put("vdcName", this.getVdcName())
			.put("vdcId", this.getVdcId())
			.put("threshold", this.getThreshold())
			.put("affectedObjects", this.getAffectedObjects())
			.toString();
		} catch (JSONException e) {
			e.printStackTrace();
			return "Error";
		}
		
	}
	
	
}
