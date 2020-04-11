package com.baseproject.business.menu.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baseproject.business.menu.dto.MenuResponseDto;
import com.baseproject.business.menu.service.MenuService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/menu")
public class MenuController {

	private static final Logger logger = LogManager.getLogger(MenuController.class);

	@Autowired
	private MenuService menuService;

	@GetMapping("")
	@ApiOperation(value = "Get all menu")
	public ResponseEntity<List<MenuResponseDto>> getAllActiveMenu() {

		try {
			List<MenuResponseDto> list = menuService.getAllActiveMenu();
			return ResponseEntity.ok(list);
		} catch (Exception e) {
			logger.error("Exception -- ", e);
			throw e;
		}

	}
}
