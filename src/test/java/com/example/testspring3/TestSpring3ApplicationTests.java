package com.example.testspring3;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestSpring3ApplicationTests {

    @Autowired
    TestService testService;

    @Test
    void contextLoads() {
        assert testService != null;
    }

}
