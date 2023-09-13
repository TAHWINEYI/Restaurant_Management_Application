package com.lisbon.practice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lisbon.practice.model.USERS;
import com.lisbon.practice.respositories.UsersRepository;

@Service
public class UsersService {

	@Autowired
	private UsersRepository usersRepository;

	public List<USERS> fetchAllUsers() {
		// TODO Auto-generated method stub
		return usersRepository.findAll();
	}

	public USERS createUser(USERS user) {
		// TODO Auto-generated method stub
		return usersRepository.save(user);
	}

	public USERS updateUser(USERS user, Long users_id) {
		// TODO Auto-generated method stub
		return usersRepository.save(user);
	}

	public void deleteUserById(Long users_id) {
		// TODO Auto-generated method stub
		usersRepository.deleteById(users_id);
	}
	
}
