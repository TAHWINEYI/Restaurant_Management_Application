package com.lisbon.practice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lisbon.practice.model.ORDERS;
import com.lisbon.practice.respositories.OrdersRepository;

@Service
public class OrdersService {

	
	@Autowired
	private OrdersRepository ordersRepository;

	public List<ORDERS> getOrders() {
		// TODO Auto-generated method stub
		return ordersRepository.findAll();
	}

	public ORDERS addOrder(ORDERS order) {
		// TODO Auto-generated method stub
		return ordersRepository.save(order);
	}

	public void deleteOrder(long order_id) {
		// TODO Auto-generated method stub
		ordersRepository.deleteById(order_id);;
	}

	public ORDERS updateOrder(ORDERS order) {
		// TODO Auto-generated method stub
		return ordersRepository.save(order);
	}
}
