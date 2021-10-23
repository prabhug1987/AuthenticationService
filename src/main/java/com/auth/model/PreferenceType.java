package com.auth.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.Builder;
import lombok.Data;

/**
 * @author Prabhu G
 * @since 15/10/2021
 * @see
 * @version 1.0
 */
@Entity
@Table
@Data
@Builder
public class PreferenceType implements Serializable{
	
   /**
	* @serial
	*/
   private static final long serialVersionUID = -2060668637580467959L;

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;
   
   @Size(max = 50)
   private String name;
   
   private String description;
   
   public PreferenceType() {
	   
   }
   

}
