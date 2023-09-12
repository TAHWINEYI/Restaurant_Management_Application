package com.lisbon.practice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lisbon.practice.respositories.OrdersRepository;

@Service
public class OrdersService {

	
	@Autowired
	private OrdersRepository ordersRepository;
}
