package com.baseproject.business.employee.dto;

import com.googlecode.jmapper.annotations.JMap;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeRequestDto {

	@JMap
	private long id;

	@JMap
	private String empNo;

	@JMap
	private String fullName;
}
