package com.lisbon.practice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lisbon.practice.model.ORDERS;
import com.lisbon.practice.services.OrdersService;

@RestController
public class OrdersController {
 
	@Autowired
	private OrdersService ordersServive;
	
	@GetMapping("/orders")
	public List<ORDERS> getOrders()
	{
		return ordersServive.getOrders();
		
	}
	
	@PostMapping("/newOrder")
	public ORDERS createOrder(@RequestBody ORDERS order, @PathVariable long orders_id){
		return ordersServive.addOrder(order);
		
	}
	
	@PutMapping("/updateOrder/{order_id}")
	public ORDERS updateOrder(@RequestBody ORDERS order, @PathVariable long orders_id)
	{
		return ordersServive.updateOrder(order);
	}
	
	@DeleteMapping("/deleteOrder/{order_id}")
	public String deleteOrderById(@PathVariable long order_id)
		{
			ordersServive.deleteOrder(order_id);
			return "order succesfully deleted";
		}
	}
