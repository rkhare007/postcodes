package com.example.postcodes.service;

import com.example.postcodes.connectors.PostCodeConnector;
import com.example.postcodes.controller.model.PostCodeResponse;
import com.example.postcodes.repository.RedisRecord;
import com.example.postcodes.repository.RedisRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class PostCodeService {

    private final RedisRepo redisRepo;

    private final PostCodeConnector postCodeConnector;

    public ResponseEntity<PostCodeResponse> getRandomPostCode(){
        ResponseEntity<PostCodeResponse>  response=postCodeConnector.getRandomPostCode();
        if(response.hasBody())
            saveRedis(response.getBody());
        return response;
    }

    private void saveRedis(PostCodeResponse response){
        String postcode = response.getResult().getPostcode();
        redisRepo.save(RedisRecord.builder().postcode(postcode).present(true).build());
    }


}
