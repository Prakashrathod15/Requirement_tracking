package com.rathod.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rathod.Repository.Job_Requester_repo;
import com.rathod.entity.Job_Requester;



@Service
public class Job_Requester_Service {
	
	@Autowired
	Job_Requester_repo repo;
	
	public List<Job_Requester> getRequesterData(String name)
	{	
		List<Job_Requester> list = repo.findByRequesterName(name);
		   return list;    
	}
	
	public List<Job_Requester> saveRequirement(Job_Requester user)
	{
		   repo.save(user);
		   List<Job_Requester> list = repo.findByRequesterName(user.getRequester_name());
		   return list;
	}
	
	
	

}
