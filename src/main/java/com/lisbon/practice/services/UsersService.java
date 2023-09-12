package com.lisbon.practice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lisbon.practice.respositories.UsersRepository;

@Service
public class UsersService {

	@Autowired
	private UsersRepository usersRepository;
}
