package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumTest {

	public static final Sum sum = new Sum();

	@Test
	void handleRequest_positiveNumbers() {
		Double output = sum.handleRequest(new Input(1.1, 2.2), null);
		assertEquals(1.1 + 2.2, output);
	}

	@Test
	void handleRequest_negativeNumbers() {
		Double output = sum.handleRequest(new Input(-1.1, -2.2), null);
		assertEquals(-1.1 + (-2.2), output);
	}

	@Test
	void handleRequest_nullInput() {
		Double output = sum.handleRequest(null, null);
		assertEquals(0, output);
	}

}