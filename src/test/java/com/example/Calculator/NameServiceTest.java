package com.example.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NameServiceTest {

	@Test
	@DisplayName("본인 이름을 정확히 반환한다")
	void getMyName_shouldReturnRealName() {
		NameService nameService = new NameService();
		String expected = "김진성";
		assertEquals(expected, nameService.getMyName());
	}
}