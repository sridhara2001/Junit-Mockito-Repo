package com.student.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.voya.exception.InvalidNumberException;
import com.voya.training.StudentDetails;

class StudentDetailsTest {
	StudentDetails studentDetails = null;

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
		studentDetails = new StudentDetails();
		System.out.println("Called before each testcases");
	}

	@AfterEach
	void tearDown() throws Exception {
		studentDetails = null;
		System.out.println("Called after each testcases");
	}

	@Test
	@DisplayName("Testing positive marks")
	void testTotalMarks() {
		int actual = studentDetails.totalMarks(1, 2, 3);
		assertEquals(6, actual);
	}
	
	@Test
	@DisplayName("Testing Negative marks")
	@Tag("Neg")
	void testNegMarks() {
		assertThrows(InvalidNumberException.class, ()->studentDetails.totalMarks(90, -20, 80));
	}
	
	@Test
	@DisplayName("Testing Greater marks")
	void testGreatMarks() {
		assertThrows(InvalidNumberException.class, ()->studentDetails.totalMarks(90, 120, 80));
	}

}
