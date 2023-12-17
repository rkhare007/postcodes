package com.example.postcodes.controller;

import com.example.postcodes.controller.model.PostCodeResponse;
import com.example.postcodes.service.PostCodeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PostCodeController {

    private final PostCodeService postCodeService;

    @GetMapping("/randompostcode")
    public ResponseEntity<PostCodeResponse> getRandomPost(){
        return postCodeService.getRandomPostCode();
    }

}
