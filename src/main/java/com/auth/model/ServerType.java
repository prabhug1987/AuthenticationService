package com.auth.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table
public class ServerType implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private short id;
	
	@Size(max = 50)
	private String name;
	private String description;

}
