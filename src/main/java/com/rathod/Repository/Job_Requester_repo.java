package com.rathod.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rathod.entity.Job_Requester;


@Repository
public interface Job_Requester_repo extends JpaRepository<Job_Requester,Integer>{
	
	List<Job_Requester> findByRequesterName(String requesterName);

}
