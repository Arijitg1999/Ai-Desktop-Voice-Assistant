package com.arijit.MvcProject.service;
import org.springframework.beans.factory.annotation.Autowired;





import org.springframework.stereotype.Service;

import com.arijit.MvcProject.model.RequestData;
import com.arijit.MvcProject.repository.RegistrationRepo;

@Service
public class Imp {
	@Autowired
	RegistrationRepo registrationRepo;
	
	public String setData(RequestData requestData) throws Exception{
		registrationRepo.save(new com.arijit.MvcProject.entity.User(requestData.getUserName(), requestData.getPassword(), requestData.getEmail()));
		return "success";
	}
}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////package com.arijit.MvcProject.service;
////
////import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.stereotype.Service;
////
////import com.arijit.MvcProject.entity.User;
////import com.arijit.MvcProject.repository.RegistrationRepo;
////
////@Service("RegistrationRepo")
////public class Imp {
////	
////	@Autowired
////	RegistrationRepo registrationRepo;
////	
////	public String crateUser(User user) {
////		registrationRepo.save(user);
////		return "success";
////	}
////	
////}
