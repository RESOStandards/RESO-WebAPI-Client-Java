package org.reso.web.api.client.wrapper;

import org.junit.Test;

import static org.junit.Assert.*;

public class JsonResoClientWrapperTest {

	@Test
	public void constructorValidationTest() {
		try {
			new JsonResoClientWrapper(null);
			fail("Validation exception not thrown");
		} catch (Exception e) {
			assertTrue("Wrong message", e.getMessage().contains("ResoClient must not be null"));
		}
	}
	
}
