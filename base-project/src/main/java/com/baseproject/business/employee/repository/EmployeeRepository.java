package com.baseproject.business.employee.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.baseproject.business.employee.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, Long> {

	Employee findByEmpNo(String empNo);

	List<Employee> findByFullNameLike(String fullName);

	@Query("{fullName:'?0'}")
	List<Employee> findCustomByFullName(String fullName);
}
