package com.example.springboot_swagger.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.examples.Example;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.media.Content;
import io.swagger.v3.oas.models.responses.ApiResponse;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition
@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI baseOpenAPI(){

        ApiResponse badRequest = new ApiResponse().content(
                new Content().addMediaType("application/json",
                        new io.swagger.v3.oas.models.media.MediaType().addExamples("default",
                                new Example().value("{\"code\" : 400, \"status\" : \"Bad Request\", \"Message\" : \"Bad Request\"}"))));
        ApiResponse internalServerError = new ApiResponse().content(
                new Content().addMediaType("application/json",
                        new io.swagger.v3.oas.models.media.MediaType().addExamples("default",
                                new Example().value("{\"code\" : 500, \"status\" : \"internalServerError\", \"Message\" : \"internalServerError\"}"))));
        ApiResponse successfulResponse = new ApiResponse().content(
                new Content().addMediaType("application/json",
                        new io.swagger.v3.oas.models.media.MediaType().addExamples("default",
                                new Example().value("{\"name\":\"string\",\"surname\":\"string\",\"age\":0}"))));

        Components components = new Components();
        components.addResponses("badRequest",badRequest);
        components.addResponses("internalServerError",internalServerError);
        components.addResponses("successfulResponse",successfulResponse);

        return new OpenAPI().components(components).info(new Info().title("Springboot_Swagger Project OpenAPI Docs").version("1.0.0").description("Doc Description"));
    }

}
