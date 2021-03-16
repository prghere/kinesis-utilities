package com.erdos.aws.kinesisutilities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties("hello-world-service")
public class HelloWorldServiceProperties {

    private String message;
}
