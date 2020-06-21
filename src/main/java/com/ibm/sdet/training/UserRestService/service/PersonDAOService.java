package com.ibm.sdet.training.UserRestService.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.ibm.sdet.training.UserRestService.entity.Person;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository //this will tell spring boot that this will communicate with database
@Transactional
public class PersonDAOService {
	
	@PersistenceContext
	EntityManager entityManager;
	
	public void addPerson(Person person) {
		// open connect
		entityManager.persist(person);
		System.out.println("You are in PersonDAOService.");
	}

}
