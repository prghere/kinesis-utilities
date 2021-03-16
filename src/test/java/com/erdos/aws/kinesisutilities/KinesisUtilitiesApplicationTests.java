package com.erdos.aws.kinesisutilities;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest("hello-world-service.message=Hello")
class KinesisUtilitiesApplicationTests {

    @Autowired
    private HelloWorldService helloWorldService;

    @Test
    void contextLoads() {
        assertThat(helloWorldService.message()).isNotNull();

    }

    @SpringBootApplication
    static class TestConfiguration {
    }
}
