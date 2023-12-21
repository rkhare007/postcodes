package com.example.postcodes.repository;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("Record")
@Builder
@Getter
@Setter
public class RedisRecord {

    @Id
    String postcode;

    boolean present;
}
