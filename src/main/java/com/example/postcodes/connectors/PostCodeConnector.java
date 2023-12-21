package com.example.postcodes.connectors;

import com.example.postcodes.configuration.PostCodeConfiguration;
import com.example.postcodes.controller.model.PostCodeResponse;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@Slf4j
public class PostCodeConnector {

    private RestTemplate restTemplate;
    private final PostCodeConfiguration postCodeConfiguration;

    public PostCodeConnector(RestTemplateBuilder restTemplate, PostCodeConfiguration postCodeConfiguration) {
        this.restTemplate = restTemplate.build();
        this.postCodeConfiguration = postCodeConfiguration;
    }

    public ResponseEntity<PostCodeResponse> getRandomPostCode(){
        log.info("Fetching Random PostCode Details");
        HttpEntity httpEntity= HttpEntity.EMPTY;
        try{
            ResponseEntity<PostCodeResponse> response = restTemplate.exchange(postCodeConfiguration.getPostCodeRandomUrl(), HttpMethod.GET, httpEntity,PostCodeResponse.class);
            return response;
        }catch (NullPointerException ex){
            throw new NullPointerException(ex.getMessage());
        }
    }

}
