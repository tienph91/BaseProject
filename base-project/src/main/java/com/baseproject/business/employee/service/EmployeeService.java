package com.baseproject.business.employee.service;

import java.util.List;

import com.baseproject.business.employee.dto.EmployeeRequestDto;
import com.baseproject.business.employee.dto.EmployeeResponseDto;

public interface EmployeeService {

	public List<EmployeeResponseDto> getAllEmployess();

	public EmployeeResponseDto insertEmployee(EmployeeRequestDto requestDto);
}
