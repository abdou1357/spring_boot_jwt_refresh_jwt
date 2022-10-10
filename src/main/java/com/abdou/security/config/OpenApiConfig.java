package com.abdou.security.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.SpringDocUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class OpenApiConfig {
@Bean
public OpenAPI customOpenAPI() {
    SpringDocUtils.getConfig().replaceWithClass(org.springframework.data.domain.Pageable.class,
            org.springdoc.core.converters.models.Pageable.class);
    return new OpenAPI().components(new Components())
            .info(new Info().title("Contact management Application API")
                    .description(
                            "This is a sample Spring Boot RESTful service using springdoc-openapi and OpenAPI 3.")
                    .version("1.0"));
}



}