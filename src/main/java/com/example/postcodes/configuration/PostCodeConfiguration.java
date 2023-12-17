package com.example.postcodes.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
public class PostCodeConfiguration {

    @Value("${postcode.randompostcodeurl}")
    private String postCodeRandomUrl;
}
