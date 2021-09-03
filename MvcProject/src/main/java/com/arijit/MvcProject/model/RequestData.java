package com.arijit.MvcProject.model;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RequestData {
	
	@JsonProperty("userName")
	private String userName;
	
	@JsonProperty("password")
	private String password;

	@JsonProperty("email")
	private String email;
	}

