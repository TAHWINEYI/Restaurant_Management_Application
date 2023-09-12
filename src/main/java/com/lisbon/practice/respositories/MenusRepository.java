package com.lisbon.practice.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lisbon.practice.model.MENUS;

@Repository
public interface MenusRepository extends JpaRepository<MENUS, Long> {
	

}
