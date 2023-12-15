package com.rathod.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Job_Requester_data")
public class Job_Requester {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="sr_no")
	Integer sr_no;
	@Column(name="requester_name")
	String requesterName;
	@Column(name="designation")
	String designation;
	@Column(name="raised_no")
	Date raised_no;
	@Column(name="status")
	String status;
	@Column(name="close_no")
	Date close_no;
	@Column(name="department")
	String department;
	@Column(name="job_role")
	String job_role;
	@Column(name="educational_background")
	String educational_background;
	@Column(name="experience")
	int experience;
	@Column(name="priority")
	String priority;
	
	
	
	
	
	
	public Job_Requester()
	{
		
	}

	

	public Job_Requester(Integer sr_no, String requester_name, String designation, Date raised_no, String status,
			Date close_no, String department, String job_role, String educational_background, int experience,
			String priority) {
		super();
		this.sr_no = sr_no;
		this.requesterName = requester_name;
		this.designation = designation;
		this.raised_no = raised_no;
		this.status = status;
		this.close_no = close_no;
		this.department = department;
		this.job_role = job_role;
		this.educational_background = educational_background;
		this.experience = experience;
		this.priority = priority;
	}
	
	

   
   
	


	public Job_Requester(String requesterName, String designation, String department, String job_role,
			String educational_background, int experience, String priority) {
		super();
		this.requesterName = requesterName;
		this.designation = designation;
		this.department = department;
		this.job_role = job_role;
		this.educational_background = educational_background;
		this.experience = experience;
		this.priority = priority;
	}



	public String getRequester_name() {
		return requesterName;
	}

	public void setRequester_name(String requester_name) {
		this.requesterName = requester_name;
	}

	public int getSr_no() {
		return sr_no;
	}

	public void setSr_no(int sr_no) {
		this.sr_no = sr_no;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Date getRaised_no() {
		return raised_no;
	}

	public void setRaised_no(Date raised_no) {
		this.raised_no = raised_no;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getClose_no() {
		return close_no;
	}

	public void setClose_no(Date close_no) {
		this.close_no = close_no;
	}



	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	public String getJob_role() {
		return job_role;
	}



	public void setJob_role(String job_role) {
		this.job_role = job_role;
	}



	public String getEducational_background() {
		return educational_background;
	}



	public void setEducational_background(String educational_background) {
		this.educational_background = educational_background;
	}



	public int getExperience() {
		return experience;
	}



	public void setExperience(int experience) {
		this.experience = experience;
	}



	public String getPriority() {
		return priority;
	}



	public void setPriority(String priority) {
		this.priority = priority;
	}



	public void setSr_no(Integer sr_no) {
		this.sr_no = sr_no;
	}



	@Override
	public String toString() {
		return "Job_Requester [sr_no=" + sr_no + ", requester_name=" + requesterName + ", designation=" + designation
				+ ", raised_no=" + raised_no + ", status=" + status + ", close_no=" + close_no + ", department="
				+ department + ", job_role=" + job_role + ", educational_background=" + educational_background
				+ ", experience=" + experience + ", priority=" + priority + "]";
	}

	
	
	
	
	

}
