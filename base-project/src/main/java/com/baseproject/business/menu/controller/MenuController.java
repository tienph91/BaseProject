package com.baseproject.business.menu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baseproject.business.menu.dto.MenuResponseDto;
import com.baseproject.business.menu.service.MenuService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/menu")
public class MenuController {

	@Autowired
	private MenuService menuService;

	@GetMapping("")
	@ApiOperation(value = "Get all menu")
	public List<MenuResponseDto> getAllActiveMenu() {

		List<MenuResponseDto> list = menuService.getAllActiveMenu();
		return list;
	}
}
