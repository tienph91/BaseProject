package com.baseproject.business.common;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;

import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Getter
@Setter
public class BaseEntity implements Serializable {

	private Date createdAt;

	private Date updatedAt;

	@Column(name = "delete_flag")
	private Boolean deletedFlag = false;
}
