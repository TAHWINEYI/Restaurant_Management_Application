package com.lisbon.practice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.lisbon.practice.services.RestaurantService;

@RestController
public class RestaurantsControllers {

	@Autowired
	private RestaurantService restsurantServive;
}
