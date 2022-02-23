package org.jk.controller;

import java.util.List;

import org.jk.dao.PersonRepository;
import org.jk.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	@Autowired
	private PersonRepository personRepository;
	
	@GetMapping("/")
	public String home(){
		return "Hello!!";
	}
	
	@GetMapping("/person")
	public List<Person> getAllPersons(){
		return personRepository.findAll();
	}
	
	@GetMapping("/person/{id}")
	public Person getPersonById(@PathVariable("id") Long personId){
		if(personRepository.findById(personId).isPresent())
			return personRepository.getById(personId);
		else
			return null;
	}

}
