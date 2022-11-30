package com.example.testspring3

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class TestSpring3ApplicationSpec extends Specification {

	@Autowired
	TestService testService

	def "context test"() {
		expect:
			testService != null
	}
}
