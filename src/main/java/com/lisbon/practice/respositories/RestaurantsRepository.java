package com.lisbon.practice.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lisbon.practice.model.RESTAURANTS;

public interface RestaurantsRepository extends JpaRepository<RESTAURANTS, Long> {

}
