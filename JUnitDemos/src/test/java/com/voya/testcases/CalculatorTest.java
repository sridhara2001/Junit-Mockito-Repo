package com.voya.testcases;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.voya.training.Calculator;

public class CalculatorTest {
	
	Calculator calculator = null;

	@BeforeAll
	static void init() throws Exception {
		System.out.println("Called before all the testcases");
	}

	@AfterAll
	static void cleanup() throws Exception {
		System.out.println("Called after all the testcases");
	}

	@BeforeEach
	void setUp() throws Exception {
		calculator = new Calculator();
		System.out.println("Called before each testcases");
	}

	@AfterEach
	void tearDown() throws Exception {
		calculator = null;
		System.out.println("Called after each testcases");
	}

	@Test
	@DisplayName("Testing sum method")
	void testSum() {
		int actual =calculator.sum(10, 20);
		assertEquals(30, actual,"ouput should be 30");
	}
	
	@Test
	@DisplayName("Testing product method")
	void testProduct() {
		int actual = calculator.product(10, 20);
		assertEquals(200, actual,"output should be 200");
	}
	
	@Test
	@DisplayName("Testing Message method")
	void testGreetMessage() {
		String actual = calculator.greetMessage("Sridhar");
		assertEquals("Welcome Sridhar", actual,"output should be Sridhar");
	}
	
	@Test
	@DisplayName("Testing List Method")
	void testShowCourse() {
		List<String> expectedCourse = Arrays.asList("Angular","CSS","HTML","Java","Spring");
		List<String> courseInput = Arrays.asList("CSS","Java","Spring","Angular","HTML");
		List<String> actualCourse = calculator.showCourses(courseInput);
		Collections.sort(actualCourse);
		assertEquals(expectedCourse, actualCourse);
	}

}
