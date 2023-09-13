package com.lisbon.practice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lisbon.practice.model.USERS;
import com.lisbon.practice.services.UsersService;

@RestController
public class UsersController {
	
	@Autowired
	private UsersService usersService;
	
	@GetMapping("/users")
	public List<USERS> getAllUsers(){
		
		return usersService.fetchAllUsers();
	}
	
	@PostMapping("/saveUser")
	public USERS addUsers(@Validated @RequestBody USERS user) {
		
		return usersService.createUser(user);
		
	}
	
	@PutMapping("/updateUsers/{users_id}")
	public USERS editUser(@RequestBody USERS user, @PathVariable Long users_id)
	{
		return usersService.updateUser(user, users_id);
		
	}
	
	@DeleteMapping("deleteUser/{users_id}")
	public String deleteUsers(@PathVariable Long users_id)
	{
		usersService.deleteUserById(users_id);
		return "successfully deleted user";
		
	}
	

}
