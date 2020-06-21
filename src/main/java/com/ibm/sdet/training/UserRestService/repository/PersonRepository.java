package com.ibm.sdet.training.UserRestService.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.sdet.training.UserRestService.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
	
	// created a findByAge method
	public Optional<Person> findByAge(int age);

}
