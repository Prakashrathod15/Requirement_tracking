package com.rathod.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rathod.entity.user;
import com.rathod.service.Job_Requester_Service;
import com.rathod.service.userService;

@RestController
public class LoginController {
    @Autowired
	userService service;
    
    @Autowired
	Job_Requester_Service req_repo;
	
	//@GetMapping("/user")
	public Object Authentication(user user)
	{
		Object ref = service.verify(user);
		if(ref instanceof String)
		{
			System.out.println(" String  ");
		}else {
			System.out.println(" Not string ");
		}
		return ref;
	}
	
	
}
