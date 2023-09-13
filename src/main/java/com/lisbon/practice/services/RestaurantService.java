package com.lisbon.practice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lisbon.practice.model.RESTAURANTS;
import com.lisbon.practice.respositories.RestaurantsRepository;

@Service
public class RestaurantService {

	@Autowired
	private RestaurantsRepository restaurantsRepository;

	public List<RESTAURANTS> getRestaurants() {
		// TODO Auto-generated method stub
		return restaurantsRepository.findAll();
	}

	public RESTAURANTS addRestaurant(RESTAURANTS restaurants) {
		// TODO Auto-generated method stub
		return restaurantsRepository.save(restaurants);
	}

	public RESTAURANTS updateRestuarant(RESTAURANTS restaurant) {
		// TODO Auto-generated method stub
		return restaurantsRepository.save(restaurant);
	}

	public void deleteRestuarant(long restaurant_id) {
		// TODO Auto-generated method stub
		restaurantsRepository.deleteById(restaurant_id);
	}
}
