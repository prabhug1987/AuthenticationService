package com.auth.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table
public class ServerType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2685580108528254437L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short id;
	
	@Size(max = 50)
	private String name;
	private String description;

}
