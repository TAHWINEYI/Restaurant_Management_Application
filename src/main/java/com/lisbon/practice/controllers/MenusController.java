package com.lisbon.practice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.lisbon.practice.services.MenusService;

@RestController
public class MenusController {

	@Autowired
	private MenusService menusServive;
}
