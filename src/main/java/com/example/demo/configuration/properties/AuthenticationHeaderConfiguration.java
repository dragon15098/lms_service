package com.example.demo.configuration.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "app.authorization.header")
@Getter
@Setter
public class AuthenticationHeaderConfiguration {

    private String name;
    private String prefix;

}
