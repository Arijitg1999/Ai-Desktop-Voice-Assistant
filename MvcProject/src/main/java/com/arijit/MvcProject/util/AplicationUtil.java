package com.arijit.MvcProject.util;





import com.arijit.MvcProject.model.RequestData;
import com.fasterxml.jackson.databind.ObjectMapper;



public class AplicationUtil {
	
	private RequestData requestData;
	
	public static AplicationUtil getInstance(RequestData requestData) {
		return new AplicationUtil(requestData);
	}
	
	AplicationUtil(RequestData requestData) {
		this.requestData = requestData;
	}
	
	public String jsonObject() throws Exception{
		ObjectMapper objectMapper = new ObjectMapper();
		String data = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(requestData);
		return data;
	}

}