package com.baseproject.business.menu.service;

import java.util.List;

import com.baseproject.business.menu.dto.MenuResponseDto;

public interface MenuService {

	public List<MenuResponseDto> getAllActiveMenu();
}
