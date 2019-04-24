package com.joan.mongo.sprgboot.mongospringboot;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<Users, String> {
	
	// Users findByName(String name);
	
	

}
