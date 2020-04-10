package com.baseproject.business.menu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.baseproject.business.common.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Menu")
@Getter
@Setter
public class Menu extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3759345949704020273L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;

	@Column(name = "parent_id")
	private Integer parentId;

	private String note;

}
