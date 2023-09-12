package com.lisbon.practice.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class RESTAURANTS implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 484933062411284618L;


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "RESTAURANT_ID")
	private long restaurant_id; 
	
	@Column(name = "NAME" , length = 100 , nullable =false)
	private String name;
	
	@Column(name = "DESCRIPTION" , length = 1000 , nullable =false)
	private String description;
	
	@Column(name = "LOCATION" , length = 400 , nullable =false)
	private String location;

	@DateTimeFormat(pattern = "YYYY/MM/DD HH:MM:SS")
	@Column(name = "CREATED_AT" , nullable =false)
	private LocalDateTime created_at;
	
	@DateTimeFormat(pattern = "YYYY/MM/DD HH:MM:SS")
	@Column(name = "UPDATED_AT" , nullable =false)
	private LocalDateTime updated_at;
	
}
