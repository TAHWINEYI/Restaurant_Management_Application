package com.lisbon.practice.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lisbon.practice.model.USERS;

public interface UsersRepository extends JpaRepository<USERS, Long> {

}
