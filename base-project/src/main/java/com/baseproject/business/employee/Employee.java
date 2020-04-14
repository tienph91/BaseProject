package com.baseproject.business.employee;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Document
@Getter
@Setter
@ToString
public class Employee {

	@Id
	private long id;

	@Indexed
	@Field(value = "Emp_No")
	private String empNo;

	@Field(value = "Full_Name")
	private String fullName;
}
