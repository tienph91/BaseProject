package com.baseproject.business.employee.controller;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Min;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baseproject.business.employee.dto.EmployeeRequestDto;
import com.baseproject.business.employee.dto.EmployeeResponseDto;
import com.baseproject.business.employee.service.EmployeeService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/employee")
@Validated
public class EmployeeController {

	private static final Logger logger = LogManager.getLogger(EmployeeController.class);

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/{id}")
	public ResponseEntity<List<EmployeeResponseDto>> getAllActiveMenu(
			@Valid @PathVariable @Min(value = 1, message = "Lon hon 1") int id) {

		try {
			List<EmployeeResponseDto> list = employeeService.getAllEmployess();
			System.out.println(list.toString());
			return ResponseEntity.ok(list);
		} catch (Exception e) {
			logger.error("Exception -- ", e);
			throw e;
		}
	}

	@PostMapping("/insert")
	@ApiOperation(value = "Insert employee")
	public ResponseEntity<EmployeeResponseDto> insertEmployee(@RequestBody EmployeeRequestDto employeeRequestDto) {

		try {
			return ResponseEntity.ok(employeeService.insertEmployee(employeeRequestDto));
		} catch (Exception e) {
			logger.error("Exception -- ", e);
			throw e;
		}
	}

}
