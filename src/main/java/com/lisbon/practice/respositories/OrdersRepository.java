package com.lisbon.practice.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lisbon.practice.model.ORDERS;

public interface OrdersRepository extends JpaRepository<ORDERS, Long> {

}
