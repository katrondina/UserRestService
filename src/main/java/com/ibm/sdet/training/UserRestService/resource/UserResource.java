package com.ibm.sdet.training.UserRestService.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.sdet.training.UserRestService.exception.UserNotFoundException;
import com.ibm.sdet.training.UserRestService.model.User;
import com.ibm.sdet.training.UserRestService.service.UserService;

@RestController
public class UserResource {
	
	@Autowired UserService userService;
	
	@GetMapping("users/all")
	public List<User> printAllUsers() {
		return  userService.printUsers();
	}
	
	@GetMapping("users/{id}")
	public User printAUser(@PathVariable int id) throws Exception {
		User user = userService.printAUser(id);
		
		if(user == null) {
			throw new UserNotFoundException("User id " + id + " not found!");
		}
		
		return userService.printAUser(id);
	}
	
	@PostMapping("users")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	
	@PostMapping("multiple/users")
	public List<User> addUser(@RequestBody List<User> users) {
		return userService.addMultipleUsers(users);
	}
	
	@DeleteMapping("user/{id}")
	public void deleteUser(@PathVariable int id) {
		userService.deleteUser(id);
	}
	
	@PutMapping("user")
	public void updateUser(@RequestBody User user) {
		userService.updateUser(user);
	}
}
