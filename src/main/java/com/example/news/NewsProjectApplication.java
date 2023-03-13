package com.example.news;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;



//@EnableConfigurationProperties({
//        ServerProperties.class, OpenApiProperty.class
//})
@SpringBootApplication
@OpenAPIDefinition
public class NewsProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewsProjectApplication.class, args);
    }

}
