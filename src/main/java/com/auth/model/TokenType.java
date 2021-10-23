package com.auth.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

@Entity
@Table
public class TokenType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "SEQ_TOKEN_TYPE")
	private int id;

	@Column(nullable = false)
	private long createdAt;

	@CreatedBy
	@Column(nullable = false)
	private String createdBy;

	private String description;

	@Min(value = 3)
	@Max(value = 50)
	private String name;

	@Column(nullable = true, updatable = true)
	private long updatedAt;

	@LastModifiedBy
	@Column(nullable = true, updatable = true)
	private String updatedBy;

	public TokenType() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(long createdAt) {
		this.createdAt = createdAt;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "TokenType [id=" + id + ", createdAt=" + createdAt + ", createdBy=" + createdBy + ", description="
				+ description + ", name=" + name + "]";
	}

}
