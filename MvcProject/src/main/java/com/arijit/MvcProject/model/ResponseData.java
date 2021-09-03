package com.arijit.MvcProject.model;



	import lombok.Getter;
	import lombok.Setter;
	import lombok.NoArgsConstructor;
	import lombok.AllArgsConstructor;

	import com.fasterxml.jackson.annotation.JsonProperty;

	@Getter
	@Setter
	@NoArgsConstructor
	@AllArgsConstructor
	public class ResponseData {
		
		@JsonProperty("Status")
		private String status;
	}


