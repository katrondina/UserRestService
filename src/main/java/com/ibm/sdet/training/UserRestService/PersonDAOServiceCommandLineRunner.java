package com.ibm.sdet.training.UserRestService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ibm.sdet.training.UserRestService.entity.Person;
import com.ibm.sdet.training.UserRestService.service.PersonDAOService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class PersonDAOServiceCommandLineRunner implements CommandLineRunner {
	
	private static final Logger log = LoggerFactory.getLogger(PersonDAOServiceCommandLineRunner.class);
	@Autowired PersonDAOService personDaoService;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Person person = new Person("Katrina","Rondina",28,"Tondo Manila");
		personDaoService.addPerson(person);
		log.info("New Person is added: {}", person.toString());
		//System.exit(0);
	}

}
