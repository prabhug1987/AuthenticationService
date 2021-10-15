package com.auth.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class TokenType {

	@Id
	@GeneratedValue
	private int id;
	private String createdAt;
	private String createdBy;
	private String description;
	private String name;
	private String token;

}
