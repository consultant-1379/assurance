package com.ericsson.orchestration.solutiondevelopment.triggerapi.model.test;
import static org.junit.Assert.*;

import org.junit.Test;

import com.ericsson.orchestration.solutiondevelopment.assurance.apex.model.Threshold;

public class ThresholdTest {

	@Test
	public void testGettersAndSetters() {
		Threshold thresholdTest = new Threshold();
		thresholdTest.setMeterName("testMeterName");
		thresholdTest.setMeterValue("68");
		thresholdTest.setThreshold("70");
		
		assertEquals("testMeterName",thresholdTest.getMeterName());
		assertEquals("68",thresholdTest.getMeterValue());
		assertEquals("70",thresholdTest.getThreshold());
	}

}
