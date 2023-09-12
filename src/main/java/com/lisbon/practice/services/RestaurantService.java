package com.lisbon.practice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lisbon.practice.respositories.RestaurantsRepository;

@Service
public class RestaurantService {

	@Autowired
	private RestaurantsRepository restaurantsRepository;
}
