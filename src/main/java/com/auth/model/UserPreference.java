package com.auth.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class UserPreference {

	@Id
	@GeneratedValue
	private long id;
	
	@OneToOne
	private PreferenceType preferenceType;
	
	public UserPreference() {
		
	}
	
	

}
