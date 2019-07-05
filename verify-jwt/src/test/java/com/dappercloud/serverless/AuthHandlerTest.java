package com.dappercloud.serverless;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class AuthHandlerTest {
	
	@Test
	public void verifyBadTokenTest() {
		Map<String, Object> data = new HashMap<String,Object>();
		data.put("token", "failing test");
		
		boolean valid = AuthHandler.verify(data);
			
		assertEquals("Generated token is verified", false, valid);
	}
	
	@Test
	public void verifyMissingTokenTest() {
		Map<String, Object> data = new HashMap<String,Object>();
		
		boolean valid = AuthHandler.verify(data);
			
		assertEquals("Generated token is verified", false, valid);
	}


}