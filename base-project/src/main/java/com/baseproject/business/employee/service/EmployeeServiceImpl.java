package com.baseproject.business.employee.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.baseproject.business.employee.Employee;
import com.baseproject.business.employee.dto.EmployeeRequestDto;
import com.baseproject.business.employee.dto.EmployeeResponseDto;
import com.baseproject.business.employee.repository.EmployeeRepository;
import com.googlecode.jmapper.JMapper;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	private JMapper<EmployeeResponseDto, Employee> entityToDto = new JMapper<>(EmployeeResponseDto.class,
			Employee.class);

	private JMapper<Employee, EmployeeRequestDto> dtoToEntity = new JMapper<>(Employee.class, EmployeeRequestDto.class);

	@Override
	public List<EmployeeResponseDto> getAllEmployess() {
		List<Employee> list = employeeRepository.findAll();

		if (CollectionUtils.isEmpty(list)) {
			return new ArrayList<EmployeeResponseDto>();
		}

		List<EmployeeResponseDto> listResponse = new ArrayList<EmployeeResponseDto>();
		for (Employee e : list) {
			listResponse.add(entityToDto.getDestination(e));
		}

		return listResponse;
	}

	@Override
	public EmployeeResponseDto insertEmployee(EmployeeRequestDto requestDto) {
		Employee employee = dtoToEntity.getDestination(requestDto);
		employeeRepository.save(employee);

		return entityToDto.getDestination(employee);
	}

}
