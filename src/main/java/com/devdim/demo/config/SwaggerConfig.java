package com.devdim.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

/**
 * created by Dima on 1/19/2020.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    // visit http://localhost:8082/swagger-ui.html to show swagger ui

    @Bean
    public Docket apiDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.devdim.demo"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(getApiInfo());
    }

    private ApiInfo getApiInfo(){
        return new ApiInfo(
                "Event Sourcing using Axon and Spring Boot",
                "App to demonstrate Event Sourcing using Axon and Spring Boot",
                "1.0.0",
                "Terms of Service",
                new Contact("Demitry Pindrik", "", "dyebolical@gmail.com"),
                "",
                "",
                Collections.emptyList());
    }
}
