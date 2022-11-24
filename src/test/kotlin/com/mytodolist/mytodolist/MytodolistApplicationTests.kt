package com.mytodolist.mytodolist

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootTest
class MytodolistApplicationTests {

	@Test
	fun contextLoads() {
		assertEquals(1, 1)
	}

}
