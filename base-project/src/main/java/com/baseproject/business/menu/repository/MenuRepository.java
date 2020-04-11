package com.baseproject.business.menu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baseproject.business.menu.entities.Menu;

public interface MenuRepository extends JpaRepository<Menu, Integer> {

	
}
