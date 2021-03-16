package com.erdos.aws.kinesisutilities;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
@EnableConfigurationProperties(HelloWorldServiceProperties.class)
public class HelloWorldService {
    private HelloWorldServiceProperties helloWorldServiceProperties;

    public HelloWorldService(HelloWorldServiceProperties helloWorldServiceProperties) {
        this.helloWorldServiceProperties = helloWorldServiceProperties;
    }

    public String message(){
        return helloWorldServiceProperties.getMessage();
    }
}
