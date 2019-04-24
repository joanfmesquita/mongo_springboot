package com.joan.mongo.sprgboot.mongospringboot;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface PersonRepository extends MongoRepository<Person, String>{

}
