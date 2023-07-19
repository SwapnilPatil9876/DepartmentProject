package com.swap.department.service;

import java.util.List;

import com.swap.department.entity.Department;
import com.swap.department.entity.JobRole;

public interface DepartmentService {
	

	public Department saveDept(Department department);
	
	public Department getDepartment(int deptId);
	
	public List<Department> getList();
	
	public void deleteById(int deptId);

	public JobRole savejobRole1(JobRole jobRole1_id);

	public JobRole getJobRole1(int jobRole1_id);
	
	public List<JobRole> getListofJobRole1();





}
