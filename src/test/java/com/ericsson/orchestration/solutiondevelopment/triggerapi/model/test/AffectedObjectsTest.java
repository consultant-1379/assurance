package com.ericsson.orchestration.solutiondevelopment.triggerapi.model.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ericsson.orchestration.solutiondevelopment.assurance.apex.model.AffectedObjects;

public class AffectedObjectsTest {

	@Test
	public void testGettersAndSetters() {
		AffectedObjects affectedObjectsTest = new AffectedObjects();
		affectedObjectsTest.setAssetName("testAssetName");
		affectedObjectsTest.setAssetId("testAssetId");
		affectedObjectsTest.setAssetType("VM");
		affectedObjectsTest.setVdcName("testVDC");
		affectedObjectsTest.setVdcId("testVDCId");
		
		assertEquals("testAssetName",affectedObjectsTest.getAssetName());
		assertEquals("testAssetId",affectedObjectsTest.getAssetId());
		assertEquals("VM",affectedObjectsTest.getAssetType());
		assertEquals("testVDC",affectedObjectsTest.getVdcName());
		assertEquals("testVDCId",affectedObjectsTest.getVdcId());
	}

}
