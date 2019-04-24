package com.joan.mongo.sprgboot.mongospringboot;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection="companies")
public class Company {

	@Id
	private String id;
	private String name;
	private List<Person> people;
	
}
