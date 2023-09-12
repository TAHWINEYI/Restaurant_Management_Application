package com.lisbon.practice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lisbon.practice.respositories.MenusRepository;

@Service
public class MenusService {
 
	@Autowired
	private MenusRepository menuRepository;
}
