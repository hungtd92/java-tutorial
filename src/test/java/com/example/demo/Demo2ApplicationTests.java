package com.example.demo;

import com.example.demo.unittest.SupportNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class Demo2ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void assertTrue() {
		boolean rs = SupportNumber.isNumberEven(8);

		Assertions.assertTrue(rs);
	}

	@Test
	void assertFalse() {
		boolean rs = SupportNumber.isNumberEven(7);

		Assertions.assertFalse(rs);
	}
}
