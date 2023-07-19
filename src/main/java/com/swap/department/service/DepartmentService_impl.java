package com.swap.department.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.swap.department.entity.Department;
import com.swap.department.entity.JobRole;
import com.swap.department.exception.ResourceNotFoundException;
import com.swap.department.repo.DepartmentDao;

@Service
public class DepartmentService_impl implements DepartmentService {
	
	@Autowired
	DepartmentDao dao;


	@Override
	public Department saveDept(Department department) {
		Department dept = dao.saveDepartment(department);
		return dept;
	}
	
	@Override
	public Department getDepartment(int deptId) {
		Department department = dao.getDepartment(deptId);
		return department;
	}

	@Override
	public List<Department> getList() {
		List<Department> list = dao.getList();
		return list;
	}

	@Override
	public void deleteById(int deptId) {
		if(dao.existsById(deptId)) {
			dao.deleteById(deptId);
		}else {
			throw new ResourceNotFoundException("Resource Id: " + deptId + " Not Exists !!");	
		}
	}
	
	@Override
	public JobRole savejobRole1(JobRole jobRole1_id) {
		JobRole role = dao.savejobRole1(jobRole1_id);
		return role;
	}

	@Override
	public JobRole getJobRole1(int jobRole1_id) {
		JobRole jobrole1 = dao.getjobRole(jobRole1_id);
		return jobrole1;
	}

	@Override
	public List<JobRole> getListofJobRole1() {
		List<JobRole> listjobRole1 = dao.getListofJobRole1();
		return listjobRole1;
	}


	

}
