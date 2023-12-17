package com.example.postcodes.connectors;

import com.example.postcodes.configuration.PostCodeConfiguration;
import com.example.postcodes.controller.model.PostCodeResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@Slf4j
@RequiredArgsConstructor
public class PostCodeConnector {

    private RestTemplate restTemplate;
    private final PostCodeConfiguration postCodeConfiguration;

    public ResponseEntity<PostCodeResponse> getRandomPostCode(){
        log.info("Fetching Random PostCode Details");
        HttpEntity httpEntity= HttpEntity.EMPTY;
        ResponseEntity<PostCodeResponse> response = restTemplate.exchange(postCodeConfiguration.getPostCodeRandomUrl(), HttpMethod.GET, httpEntity,PostCodeResponse.class);
        return response;
    }

}
