package com.swap.department.repo;

import java.util.List;

import com.swap.department.entity.Department;
import com.swap.department.entity.JobRole;

public interface DepartmentDao {

	public Department saveDepartment(Department department);
	
	public Department getDepartment(int deptId);

	public List<Department> getList();

	public boolean existsById(int deptId);

	public void deleteById(int deptId);

	public JobRole savejobRole1(JobRole role1);

	public JobRole getjobRole(int jobRole1_id);

	public List<JobRole> getListofJobRole1();

}
