package com.voya.testcases.greet;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GreetTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("Testing null")
	void testNull() {
		List<String> myList = null;
		assertNull(myList);
	}
	
	@Test
	@DisplayName("Testing not null")
	void testNotNull() {
		List<String> myList = new ArrayList<String>();
		assertNotNull(myList);
	}
	
	@Test
	@DisplayName("Testing String Reference")
	void testSame() {
		String username = "Sridhar";
//		String nusername = new String("Sridhar"); // reference created in memory pool
		String nusername = "Sridhar";
		assertSame(username, nusername,"reference are not same");
	}
	
	@Test
	@DisplayName("Testing String literals")
	void testEquality() {
		String username = "Sridhar";
		assertEquals("Sridhar", username);
	}

}
