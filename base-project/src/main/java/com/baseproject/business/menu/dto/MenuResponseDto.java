package com.baseproject.business.menu.dto;

import javax.validation.constraints.Min;

import com.googlecode.jmapper.annotations.JMap;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MenuResponseDto {

	@JMap
	@Min(value = 1, message = "abc")
	private Integer id;

	@JMap
	private String name;

	@JMap
	private Integer parentId;

	@JMap
	private String note;
}
