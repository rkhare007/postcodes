package com.example.postcodes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedisRepo extends CrudRepository<RedisRecord,String> {
}
