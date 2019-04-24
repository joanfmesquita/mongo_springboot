package com.joan.mongo.sprgboot.mongospringboot;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongospringbootApplication implements CommandLineRunner{

	@Autowired
	CompanyRepository companyRepository;
	@Autowired
	PersonRepository personRepository;
	
	@Override
	public void run(String...args) throws Exception {
		Person person1 = new Person();
		person1.setName("Joan");
		Person savePerson = this.personRepository.save(person1);
		
		Company company1 = new Company();
		company1.setName("Minha Empresa");
		company1.setPeople(Arrays.asList(person1));
		Company saveCompany = this.companyRepository.save(company1);
		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MongospringbootApplication.class, args);
	}

}
