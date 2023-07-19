package com.swap.department.repo;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.swap.department.entity.Department;
import com.swap.department.entity.JobRole;

@Repository
public class DepartmentDao_impl implements DepartmentDao {
	
	@Autowired
	SessionFactory factory;

	@Override
	public Department saveDepartment(Department department) {
		Session session = factory.openSession();
		boolean b = false;
		Transaction tt = session.beginTransaction();
		session.save(department);
		tt.commit();
		b = true;
		session.close();
		if(b) {
			return department;
		}
		else {
		    return null;
		}
	}
	
	@Override
	public Department getDepartment(int deptId) {
		Session session = factory.openSession();
		Department department = session.get(Department.class, deptId);
		session.close();
		return department;
	}

	@Override
	public List<Department> getList() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Department.class);
		List<Department> list = criteria.list();
		session.close();
		return list;
	}

	@Override
	public boolean existsById(int deptId) {
		return false;
	}

	@Override
	public void deleteById(int deptId) {
		Session session = factory.openSession();
		session.delete(Department.class);
		session.close();
		return;
		
	}

	@Override
	public JobRole savejobRole1(JobRole role1) {
		Session session = factory.openSession();
		boolean b = false;
		Transaction tt = session.beginTransaction();
		session.save(role1);
		tt.commit();
		b = true;
		session.close();
		if(b) {
			return role1;
		}
		else {
		    return null;
		}
	}

	@Override
	public JobRole getjobRole(int jobRole1_id) {
		Session session = factory.openSession();
		JobRole jobrole = session.get(JobRole.class, jobRole1_id);
		session.close();
		return jobrole;
	}

	@Override
	public List<JobRole> getListofJobRole1() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(JobRole.class);
		List<JobRole> list = criteria.list();
		session.close();
		return list;
	}



}
