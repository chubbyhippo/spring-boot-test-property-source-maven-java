package io.github.chubbyhippo.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Value("${my.config.name}")
    private String myConfigName;

    @Value("${my.config.port}")
    private Integer myConfigPort;

    @Bean
    ApplicationRunner init() {
        return args -> {
            System.out.println("my config name: " + myConfigName);
            System.out.println("my config port: " + myConfigPort);
        };
    }
}
