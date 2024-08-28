package com.ericsson.orchestration.solutiondevelopment.triggerapi.triggermessagerequest.test;
import static org.junit.Assert.*;

import org.junit.Test;

import com.ericsson.orchestration.solutiondevelopment.assurance.apex.model.AffectedObjects;
import com.ericsson.orchestration.solutiondevelopment.assurance.apex.model.Threshold;
import com.ericsson.orchestration.solutiondevelopment.assurance.apex.request.TriggerMessageRequest;

public class TriggerMessageRequestTest {
	
	@Test
	public void testGettersAndSetters() {
		Threshold thresholdTest = new Threshold();
		thresholdTest.setMeterName("testMeterName");
		thresholdTest.setMeterValue("68");
		thresholdTest.setThreshold("70");
		Threshold[] thresholdArray = new Threshold[1];
		thresholdArray[0] = thresholdTest;

		AffectedObjects[] affectedArray = new AffectedObjects[1];
		AffectedObjects affectedObjectsTest = new AffectedObjects();
		affectedObjectsTest.setAssetName("testAssetName");
		affectedObjectsTest.setAssetId("testAssetId");
		affectedObjectsTest.setAssetType("VM");
		affectedObjectsTest.setVdcName("testVDC");
		affectedObjectsTest.setVdcId("testVDCId");
		affectedArray[0] = affectedObjectsTest;
		
		TriggerMessageRequest triggerRequest = new TriggerMessageRequest();
		triggerRequest.setName("testName");
		triggerRequest.setNameSpace("testNameSpace");
		triggerRequest.setVersion("testVersion");
		triggerRequest.setSource("testSource");
		triggerRequest.setTarget("testTarget");
		triggerRequest.setEventTimeStamp("testTimeStamp");
		triggerRequest.setEventType("testEventType");
		triggerRequest.setFaultAssetType("testFaultAssetType");
		triggerRequest.setFaultAssetName("testFaultAssetName");
		triggerRequest.setFaultAssetId("testFaultAssetId");
		triggerRequest.setSeverity("testSeverity");
		triggerRequest.setProbableCause("testProbableCause");
		triggerRequest.setAdditionalText("testAdditionalText");
		triggerRequest.setTenantName("testTenantName");
		triggerRequest.setSubtenantName("testSubtenantName");
		triggerRequest.setVdcName("testVDCName");
		triggerRequest.setVdcId("testVDCId");
		triggerRequest.setAffectedObjects(affectedArray);
		triggerRequest.setThreshold(thresholdArray);
		
		assertEquals("testName",triggerRequest.getName());
		assertEquals("testNameSpace",triggerRequest.getNameSpace());
		assertEquals("testVersion",triggerRequest.getVersion());
		assertEquals("testSource",triggerRequest.getSource());
		assertEquals("testTarget",triggerRequest.getTarget());
		assertEquals("testTimeStamp",triggerRequest.getEventTimeStamp());
		assertEquals("testEventType",triggerRequest.getEventType());
		assertEquals("testFaultAssetType",triggerRequest.getFaultAssetType());
		assertEquals("testFaultAssetName",triggerRequest.getFaultAssetName());
		assertEquals("testFaultAssetId",triggerRequest.getFaultAssetId());
		assertEquals("testSeverity",triggerRequest.getSeverity());
		assertEquals("testProbableCause",triggerRequest.getProbableCause());
		assertEquals("testAdditionalText",triggerRequest.getAdditionalText());
		assertEquals("testTenantName",triggerRequest.getTenantName());
		assertEquals("testSubtenantName",triggerRequest.getSubtenantName());
		assertEquals("testVDCName",triggerRequest.getVdcName());
		assertEquals("testVDCId",triggerRequest.getVdcId());
		assertEquals(1,triggerRequest.getAffectedObjects().length);
		assertEquals(1,triggerRequest.getThreshold().length);
		System.out.println(triggerRequest.toString());
		
		
	}
}
