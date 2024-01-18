package com.green.gradleg1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan

public class GradleG1Application {

    public static void main(String[] args) {
        SpringApplication.run(GradleG1Application.class, args);
    }

}
