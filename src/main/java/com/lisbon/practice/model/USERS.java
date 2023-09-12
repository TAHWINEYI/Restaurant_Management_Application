package com.lisbon.practice.model;

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
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class USERS {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USER_ID")
	private int user_id;
	
	@Column(name = "USERNAME" , length = 300 , nullable =false)
	private String username;
	
	@Column(name = "PASSWORD" , length = 50 , nullable =false)
	private char password;
	
	@Column(name = "EMAIL" , length = 400 , nullable =false)
	private String email;
	
	@DateTimeFormat(pattern = "YYYY/MM/DD HH:MM:SS")
	@Column(name = "CREATED_AT" , nullable =false)
	private LocalDateTime created_at;
	
	@DateTimeFormat(pattern = "YYYY/MM/DD HH:MM:SS")
	@Column(name = "UPDATED_AT" , nullable =false)
	private LocalDateTime updated_at;

}
