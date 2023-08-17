package com.solutis.locadoraveiculos.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("Locadora de Veículos REST API")
                        .description("Spring Boot REST API for Locadora de Veículos")
                        .version("1.0.0"));
    }
}
