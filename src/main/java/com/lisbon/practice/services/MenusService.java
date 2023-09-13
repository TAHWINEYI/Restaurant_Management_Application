package com.lisbon.practice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lisbon.practice.model.MENUS;
import com.lisbon.practice.respositories.MenusRepository;

@Service
public class MenusService {
 
	@Autowired
	private MenusRepository menuRepository;

	public List<MENUS> viewMenus() {
		// TODO Auto-generated method stub
		return menuRepository.findAll();
	}

	public MENUS addMenu(MENUS menu) {
		// TODO Auto-generated method stub
		return menuRepository.save(menu);
	}

	public MENUS updateMenus(MENUS menu) {
		// TODO Auto-generated method stub
		return menuRepository.save(menu);
	}

	public void deleteMenus(long menus_id) {
		// TODO Auto-generated method stub
		menuRepository.deleteById(menus_id);;
	}
}
