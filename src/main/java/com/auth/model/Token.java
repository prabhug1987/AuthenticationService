package com.auth.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
@Table
//@SuppressWarnings("serial")
public class Token implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7811258479566369597L;

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long id;

	@CreatedDate
	private String createdAt;

	@CreatedBy
	@Size(max = 50)
	private String createdBy;

	private String description;
	private String name;

	@LastModifiedDate
	private String lastModifiedAt;

	@LastModifiedBy
	@Size(max = 50)
	private String lastModifiedBy;

	private String token;

	@OneToOne
	private TokenType tokenType;
	
	
}
