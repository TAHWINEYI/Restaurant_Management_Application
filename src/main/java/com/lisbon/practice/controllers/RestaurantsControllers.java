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

import com.lisbon.practice.model.RESTAURANTS;
import com.lisbon.practice.services.RestaurantService;

@RestController
public class RestaurantsControllers {

	@Autowired
	private RestaurantService restaurantService;
	
	@GetMapping("/restaurants")
	public List<RESTAURANTS> getRestaurants()
	{
		return restaurantService.getRestaurants();
		
	}
	
	@PostMapping("/addRestaurant")
	public RESTAURANTS newRestaurant(@RequestBody RESTAURANTS restaurants, @PathVariable long restaurant_id)
	{
		return restaurantService.addRestaurant(restaurants);
		
	}
	
	@PutMapping("/updateRestaurabt/{restaurant_id}")
	public RESTAURANTS updateRestaurant(@RequestBody RESTAURANTS restaurant, @PathVariable long restaurant_id)
	{
		return restaurantService.updateRestuarant(restaurant);
		
	}
	
	@DeleteMapping("/deleteRestaurant/{restaurant_id}")
	public String deleteRestaurantById(@PathVariable long restaurant_id)
	{
		
		restaurantService.deleteRestuarant(restaurant_id);
		return "the restaurant record has been deleted successfully";
		
	}
}
