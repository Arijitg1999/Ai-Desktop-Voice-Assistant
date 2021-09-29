package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name="anything")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Store {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String catagory;
	

}
