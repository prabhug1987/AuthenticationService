package com.auth.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.Builder;
import lombok.Data;

@Entity
@Table
@Data
@Builder
@SequenceGenerator(name = "SEQ_BROWSER_TYPE", sequenceName = "SEQ_BROWSER_TYPE", allocationSize = 1, initialValue = 1)
public class BrowserType implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private short id;

	@Size(max = 50)
	private String name;
	private String description;

	@Size(max = 19)
	private String browserVersion;
}
