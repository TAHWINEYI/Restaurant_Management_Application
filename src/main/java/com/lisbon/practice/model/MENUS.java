package com.lisbon.practice.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class MENUS {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "MENUS_ID")
	private long menus_id;
	
	
	@Column(name = "NAME" , length = 100 , nullable =false)
	private String name;
	
	@Column(name = "DESCRIPTION" , length = 1000 , nullable =false)
	private String description;
	
	@Column(name = "PRICE" , length = 1000000000 , nullable =false)
	private BigDecimal price;
	
	@DateTimeFormat(pattern = "YYYY/MM/DD HH:MM:SS")
	@Column(name = "CREATED_AT" , nullable =false)
	private LocalDateTime created_at;
	
	@DateTimeFormat(pattern = "YYYY/MM/DD HH:MM:SS")
	@Column(name = "UPDATED_AT" , nullable =false)
	private LocalDateTime updated_at;
	
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "MENUS_ID", insertable = false, updatable = false)
	private RESTAURANTS restaurants_id;
}
