package com.swap.department.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class JobRole {
	
	@Id
	 int jobRole_id;
	 String roleName;
	 int experience;
	 String location;
	@ManyToOne
	@JoinColumn(name = "dept_id")
	 Department department;
	@OneToMany(mappedBy = "jobRole")
	 List<Application> applicant;
	
	public JobRole() {
		super();
	}
	
	public JobRole(int jobRole_id, String roleName, int experience, String location, Department department,
			List<Application> applicant) {
		super();
		this.jobRole_id = jobRole_id;
		this.roleName = roleName;
		this.experience = experience;
		this.location = location;
		this.department = department;
		this.applicant = applicant;
	}
	
	public int getJobRole_id() {
		return jobRole_id;
	}
	public void setJobRole_id(int jobRole_id) {
		this.jobRole_id = jobRole_id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public List<Application> getApplicant() {
		return applicant;
	}
	public void setApplicant(List<Application> applicant) {
		this.applicant = applicant;
	}
	
	@Override
	public String toString() {
		return "JobRole [jobRole_id=" + jobRole_id + ", roleName=" + roleName + ", experience=" + experience
				+ ", location=" + location + ", department=" + department + ", applicant=" + applicant + "]";
	}

}
