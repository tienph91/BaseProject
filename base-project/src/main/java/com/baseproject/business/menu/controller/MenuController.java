package com.baseproject.business.menu.controller;

import java.util.List;
import java.util.Locale;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.baseproject.business.menu.dto.MenuRequestDto;
import com.baseproject.business.menu.dto.MenuResponseDto;
import com.baseproject.business.menu.service.MenuService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/menu")
@Validated
public class MenuController {

	private static final Logger logger = LogManager.getLogger(MenuController.class);

	static {
		Locale.setDefault(Locale.US);// Locale.FRANCE
	}

	@Autowired
	private MenuService menuService;

	@GetMapping("")
	@ApiOperation(value = "Get all menu")
	public ResponseEntity<List<MenuResponseDto>> getAllActiveMenu() {

		try {
			List<MenuResponseDto> list = menuService.getAllActiveMenu();
			System.out.println(list.toString());
			return ResponseEntity.ok(list);
		} catch (Exception e) {
			logger.error("Exception -- ", e);
			throw e;
		}

	}

	@PostMapping
	@ApiOperation(value = "Get menu by name post method")
	public ResponseEntity<List<MenuResponseDto>> getMenuByName(@Valid @RequestBody MenuRequestDto menuRequestDto) {

		try {
			List<MenuResponseDto> list = menuService.getAllActiveMenu();
			System.out.println(list.toString());
			return ResponseEntity.ok(list);
		} catch (Exception e) {
			logger.error("Exception -- ", e);
			throw e;
		}
	}

	@GetMapping("/name")
	@ApiOperation(value = "Get menu by name get method")
	public ResponseEntity<List<MenuResponseDto>> getMenuByName(
			@RequestParam @NotEmpty(message = "{myBean.name.null.message}") String name) {

		try {
			List<MenuResponseDto> list = menuService.getAllActiveMenu();
			System.out.println(list.toString());
			return ResponseEntity.ok(list);
		} catch (Exception e) {
			logger.error("Exception -- ", e);
			throw e;
		}
	}
}
