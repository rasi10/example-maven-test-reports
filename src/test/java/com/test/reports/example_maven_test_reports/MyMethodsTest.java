package com.test.reports.example_maven_test_reports;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyMethodsTest {
	MyMethods mm = new MyMethods();

	@Test
	public void test() {
		assertEquals(mm.add1(1),2);
	}

}
