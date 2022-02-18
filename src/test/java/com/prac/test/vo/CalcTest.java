package com.prac.test.vo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.util.StopWatch;

class CalcTest {

	@Test
	void testSum() {
		Calculator calculator = new Calculator();
		assertEquals(30, calculator.sum(15, 15));
	}

}
