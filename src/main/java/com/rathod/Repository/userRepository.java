package com.rathod.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rathod.entity.user;

@Repository
public interface userRepository extends JpaRepository<user,String>{
    
   //public Optional<user> findByUsernameANDPassword(String userName, String password);
	
	public Optional<user> findByUsernameAndPassword(String username,String password);
}
