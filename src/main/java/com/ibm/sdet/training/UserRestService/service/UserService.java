package com.ibm.sdet.training.UserRestService.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ibm.sdet.training.UserRestService.model.User;

@Component
public class UserService {
	public static List<User> users = new ArrayList<>();
	
	static {
		users.add(new User(1,"Adam",new Date()));
		users.add(new User(2,"Eve",new Date()));
		users.add(new User(3,"Jack",new Date()));
		users.add(new User(4,"John",new Date()));
		users.add(new User(5,"Michael",new Date()));
	}

	//retrieve all users
	public List<User> printUsers(){
		return users;
	}
	
	//retrieve single user 
	public User printAUser(int id) {
		for(User user : users) {
			if(user.getId() == id) {
				return user;
			}
		}
		return null;
	}
	
	//add user
	public User addUser(User user) {
		users.add(user);
		return user;
	}
	
	//add multiple users
	public List<User> addMultipleUsers(List<User> enteredUsers) {
		users.addAll(enteredUsers);
		return enteredUsers;
	}
	
	//delete a user
	public void deleteUser(int id) {
		for(User user : users) {
			if(user.getId() == id) {
				users.remove(user);
				break;
			}
		}
	}
	
	//update a user
	public void updateUser(User updateUser) {
		for(User user : users) {
			if(user.getId() == updateUser.getId()) {
				user.setName(updateUser.getName());
				user.setBirthDate(updateUser.getBirthDate());
			}
		}
	}
}
