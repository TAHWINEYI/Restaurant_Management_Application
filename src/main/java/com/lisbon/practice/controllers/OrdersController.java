package com.lisbon.practice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.lisbon.practice.services.OrdersService;

@RestController
public class OrdersController {
 
	@Autowired
	private OrdersService ordersServive;
}
