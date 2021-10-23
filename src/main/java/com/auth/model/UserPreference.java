package com.auth.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Entity
@Table
@Data
@Builder
public class UserPreference implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8414432791248170920L;

	@Id
	@GeneratedValue
	private long id;

	@OneToOne
	private PreferenceType preferenceType;

	public UserPreference() {

	}

}
