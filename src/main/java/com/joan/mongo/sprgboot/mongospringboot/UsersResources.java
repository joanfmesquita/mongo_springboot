package com.joan.mongo.sprgboot.mongospringboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/users")
public class UsersResources {
	
	@Autowired
	private UserRepository repository;
	
	
	public UsersResources(UserRepository repository) {
		this.repository = repository;
		
	}
	

	@GetMapping
	public List<Users> findAll(){	
		return this.repository.findAll();		
	}
	
	
	@PostMapping
	public Users create (@RequestBody Users user) {
		return this.repository.save(user);
	}
	
	@GetMapping("/{id}")
	public Users findById(@PathVariable String id) {
	return this.repository.findById(id).orElse(null);
	}
	
	@DeleteMapping("/{id}")
	public void remove(@PathVariable String id) {
		this.repository.deleteById(id);	
	}
	
	@PutMapping("/{id}")
	public Users update (@PathVariable String id, @RequestBody Users user) {
		
		Users toUpdate = this.repository.findById(id).orElse(null);
		if (null != toUpdate) {
			toUpdate.setEmail(user.getEmail());
			toUpdate.setNome(user.getNome());
		}
		
		return this.repository.save(toUpdate);
		
	}
	
	
}
