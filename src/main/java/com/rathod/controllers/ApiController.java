package com.rathod.controllers;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rathod.service.*;
import com.rathod.entity.Job_Requester;
import com.rathod.entity.user;

@Controller
public class ApiController {
	
	@Autowired
	userService service;
	
	@Autowired
	Job_Requester_Service req_repo;
	
	user user1 = null;
	@PostMapping("/user")
	public String loginUrl(user user, Model model)
	{
		Object ref = service.verify(user);
		
		if(ref instanceof user)
		{
			
			Optional<user> optionalUser = Optional.of((user)ref);
			 user1 = optionalUser.get();
           if(user1.getRole().equals("Recruiter"))
			{
				model.addAttribute("Hello","Hello "+user1.getUsername());
				return "Hr"; // viewResolve  - DiapatcherServlet
				
			} else if(user1.getRole().equals("Recruitment Head"))
			{
				return "manager";
				
			} else if(user1.getRole().equals("Job Requester"))
			{
				 List<Job_Requester> list = req_repo.getRequesterData(user1.getUsername());
				 model.addAttribute("jobRequesterList", list);
				 model.addAttribute("name","Job request raised by "+user1.getUsername());
				 model.addAttribute("names","Job request raised by "+user1.getUsername());
				 
				 return "JobRequester";
			}
			
			
		}else {
			
			model.addAttribute("msg",ref); // JSp - // Thymeleaf 
			return "loginfail";
	          
		}
		
		return "Hr";
	}
	
	@PostMapping("/newRequest")
	public String newRequest(@RequestParam("requesterName") String requesterName,Job_Requester user, Model model)
	{    
		 // 1.set Raised on
		 LocalDate today = LocalDate.now();
		 Date date = java.sql.Date.valueOf(today);
		 user.setRaised_no(date);
		 
		 // 2. set status
		  user.setStatus("Open");
		 // 3. set Requester name
		  user.setRequester_name(requesterName);
		  
		  
		  System.out.println(user);
		  
		 List<Job_Requester> list = req_repo.saveRequirement(user);
		  
		 model.addAttribute("jobRequesterList", list);
		 model.addAttribute("name","Job request raised by "+requesterName);
		 return "JobRequester";
	}
	
	
	
	
	
	
	
	
    
}
