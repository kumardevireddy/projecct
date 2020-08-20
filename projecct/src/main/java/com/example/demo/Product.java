package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String brand;
	private String madein;
	private float price;

}
