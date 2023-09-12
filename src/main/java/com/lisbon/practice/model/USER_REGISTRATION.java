package com.lisbon.practice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class USER_REGISTRATION {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "REGISTRATION_ID")
	private long registration_id;
	
	@Column(name = "FIRST_NAME", length = 100, nullable = false)
	private String first_name;
	
	@Column(name = "LAST_NAME", length = 100, nullable = false)
	private String last_name;
	
	@Column(name = "PASSWORD", length = 15, nullable = false)
	private String password;
	
	@Column(name = "EMAIL", length = 15, nullable = false)
	private String email;
	
	@Column(name = "PHONE", length = 15, nullable = false)
	private String phone;
	

}
