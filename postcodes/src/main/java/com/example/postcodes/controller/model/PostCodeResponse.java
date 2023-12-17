package com.example.postcodes.controller.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostCodeResponse {

    private int status;

    @JsonProperty("result")
    private Result result;
}
