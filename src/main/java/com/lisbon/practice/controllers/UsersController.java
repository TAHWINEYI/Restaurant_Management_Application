package com.lisbon.practice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.lisbon.practice.services.UsersService;

@RestController
public class UsersController {
	
	@Autowired
	private UsersService usersServive;

}
