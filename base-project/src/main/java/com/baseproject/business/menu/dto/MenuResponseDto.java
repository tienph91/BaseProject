package com.baseproject.business.menu.dto;

import com.googlecode.jmapper.annotations.JMap;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MenuResponseDto {

	@JMap
	private Integer id;

	@JMap
	private String name;

	@JMap
	private Integer parentId;

	@JMap
	private String note;
}
