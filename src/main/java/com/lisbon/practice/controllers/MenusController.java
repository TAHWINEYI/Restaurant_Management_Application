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

import com.lisbon.practice.model.MENUS;
import com.lisbon.practice.services.MenusService;

@RestController
public class MenusController {

	@Autowired
	private MenusService menusService;
	
	@GetMapping("/menus")
	public List<MENUS> allMenus()
	{
		return menusService.viewMenus();
		
	}
	
	@PostMapping("/newMenu")
	public MENUS newMenu(@RequestBody MENUS menu, @PathVariable long menus_id)
	{
		return menusService.addMenu(menu);
		
	}
	
	@PutMapping("/updateMenu/{menu_id}")
	public MENUS updateMenu (@RequestBody MENUS menu, @PathVariable long menus_id)
	{
		return menusService.updateMenus(menu);
		
	}
	
	@DeleteMapping("/deleteMenu/{menu_id}")
	public String deleteMenu(@PathVariable long menus_id)
	{
		menusService.deleteMenus(menus_id);
		return "the menu was deleted succesfully";
	}
}
