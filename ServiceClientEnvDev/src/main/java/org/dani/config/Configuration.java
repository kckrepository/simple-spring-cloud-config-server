package org.dani.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("microservice-one")
@org.springframework.context.annotation.Configuration
@Data
public class Configuration {
    private String value;
}