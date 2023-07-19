package com.swap.department.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Application {
	
	@Id
	 int applicationId;
	 String applicant;
	@ManyToOne
	@JoinColumn(name = "jobRole_id")
	 JobRole jobRole;
	
	public Application() {
		super();
	}

	public Application(int applicationId, String applicant, JobRole jobRole) {
		super();
		this.applicationId = applicationId;
		this.applicant = applicant;
		this.jobRole = jobRole;
	}

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public String getApplicant() {
		return applicant;
	}

	public void setApplicant(String applicant) {
		this.applicant = applicant;
	}

	public JobRole getJobRole() {
		return jobRole;
	}

	public void setJobRole(JobRole jobRole) {
		this.jobRole = jobRole;
	}

	@Override
	public String toString() {
		return "Application [applicationId=" + applicationId + ", applicant=" + applicant + ", jobRole=" + jobRole
				+ "]";
	}

}
