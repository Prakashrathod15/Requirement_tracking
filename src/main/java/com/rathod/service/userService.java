package com.rathod.service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rathod.Repository.userRepository;
import com.rathod.entity.user;

@Service
public class userService {
	
	@Autowired
	userRepository repository;
	
	public Object verify(user user)
	{
		
		try {
		  Optional<user> ref = repository.findById(user.getUsername());
		  Optional<user> ref2 = ref;
		  user user1 = ref2.get();
		  if(ref!=null)
		  {
			  if(user1.getPassword().equals(user.getPassword()))
			  {
				  user user2 = ref.orElse(null); // optional - Object 
				  return user2;
				 
			  }else {
			
				 return "Wrong Password";
			  }
		  }
		} catch(Exception e)
		{
			e.printStackTrace();
		}
		return "Invalide user";
	      
	}
	
	public Object find(user user)
	{
		try { 
		Optional<user> ref = repository.findByUsernameAndPassword(user.getUsername(),user.getPassword());
		return ref.get();
		}catch(Exception e)
		{
			return "Not Found";
		}
		
	}

}
