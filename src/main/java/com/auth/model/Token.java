package com.auth.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

public class Token {

	@Id
	@GeneratedValue
	private long id;

	@CreatedDate
	private String createdAt;

	@CreatedBy
	@Size(max = 100)
	private String createdBy;

	private String description;
	private String name;

	@LastModifiedDate
	private String lastModifiedAt;

	@LastModifiedBy
	private String lastModifiedBy;

	private String token;
}
