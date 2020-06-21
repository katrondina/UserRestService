package com.ibm.sdet.training.UserRestService;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ibm.sdet.training.UserRestService.entity.Person;
import com.ibm.sdet.training.UserRestService.repository.PersonRepository;

@Component
public class PersonRepositoryCommandLineRunner implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(PersonRepositoryCommandLineRunner.class);
	@Autowired PersonRepository personRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Person person = new Person("Ruel","Lacaba",20,"QC");
		Person ruel = personRepository.save(person);
		log.info("New Person is created: {}", person);
		
		Optional<Person> personOne =  personRepository.findById(1L);
		log.info("personOne retrieved: {}", personOne.get());
		
		List<Person> personList = personRepository.findAll();
		log.info("Retrieved all: {}", personList);
		
		//personRepository.deleteById(1L);
		//personRepository.delete(ruel);
		
		// to update a record
		personOne.get().setFirstName("Kat");
		personOne.get().setLastName("Smith");
		personOne.get().setAge(21);
		personOne.get().setAddress("QC");
		personRepository.save(personOne.get());
		
	}

}
