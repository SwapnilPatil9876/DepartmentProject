package com.swap.department.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Department {
	
	@Id
	@Column(name = "dept_id")
	 int deptId;
	 String deptName;
	@OneToMany(mappedBy = "department")
	 List<JobRole> roleName;
	
	public Department() {
		super();
	}

	public Department(int deptId, String deptName, List<JobRole> roleName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.roleName = roleName;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<JobRole> getRoleName() {
		return roleName;
	}

	public void setRoleName(List<JobRole> roleName) {
		this.roleName = roleName;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", roleName=" + roleName + "]";
	}
	

}
