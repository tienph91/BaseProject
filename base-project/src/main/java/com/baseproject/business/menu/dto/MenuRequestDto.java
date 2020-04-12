package com.baseproject.business.menu.dto;

import javax.validation.constraints.NotNull;

import com.baseproject.business.common.custom.validator.CheckMe;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MenuRequestDto {

	@CheckMe
	@NotNull(message = "{myBean.name.null.message}")
	private String name;
}
