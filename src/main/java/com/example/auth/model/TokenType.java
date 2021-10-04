package com.example.auth.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class TokenType {

	private int id;
	private String createdAt;
	private String createdBy;
	private String description;
	private String name;
	private String token;

}
