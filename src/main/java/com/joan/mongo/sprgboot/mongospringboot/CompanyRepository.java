package com.joan.mongo.sprgboot.mongospringboot;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface CompanyRepository extends MongoRepository<Company, String>{

}
