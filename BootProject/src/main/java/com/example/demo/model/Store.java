package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	@GeneratedValue()
	private Integer permissionId;	
	private String permissionName;
	private String permission_description;
	private String permission_group;
	private String permission_control;
	private String icon;
	private String permission_level;
	private Integer rank_data;

}
