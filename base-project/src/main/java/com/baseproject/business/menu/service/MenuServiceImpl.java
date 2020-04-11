package com.baseproject.business.menu.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.baseproject.business.menu.dto.MenuResponseDto;
import com.baseproject.business.menu.entities.Menu;
import com.baseproject.business.menu.repository.MenuRepository;
import com.googlecode.jmapper.JMapper;

@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
	private MenuRepository menuRepository;

	private JMapper<MenuResponseDto, Menu> entityToDto = new JMapper<>(MenuResponseDto.class, Menu.class);

	@Override
	public List<MenuResponseDto> getAllActiveMenu() {

		List<Menu> listMenus = menuRepository.findAll();
		if (CollectionUtils.isEmpty(listMenus)) {
			return new ArrayList<MenuResponseDto>();
		}

		List<MenuResponseDto> listReponses = new ArrayList<MenuResponseDto>();
		for (Menu menu : listMenus) {
			listReponses.add(entityToDto.getDestination(menu));
		}

		return listReponses;
	}

}
