package com.example.postcodes.service;

import com.example.postcodes.connectors.PostCodeConnector;
import com.example.postcodes.controller.model.PostCodeResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class PostCodeService {

    private final PostCodeConnector postCodeConnector;

    public ResponseEntity<PostCodeResponse> getRandomPostCode(){
        return postCodeConnector.getRandomPostCode();
    }
}
