package com.swap.department.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.swap.department.entity.Department;
import com.swap.department.entity.JobRole;
import com.swap.department.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	
	
	@Autowired DepartmentService service;
	
	@PostMapping(value="/savedepartment")
	public ResponseEntity<Department> saveDept(@RequestBody Department applicant){
		Department d = service.saveDept(applicant);
		if(d!=null) {
			return new ResponseEntity<Department>(d,HttpStatus.CREATED);
		}
		else {
			return new ResponseEntity<Department>(HttpStatus.INTERNAL_SERVER_ERROR);
		}		
	}
	
	
	@GetMapping(value="/getDepartment/{deptId}")
	public ResponseEntity<Department> getDepartment(@PathVariable int deptId){
		Department department = service.getDepartment(deptId);
		if(department!=null) {
			return new ResponseEntity<Department>(department,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<Department>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	@GetMapping(value="/getList")
	public ResponseEntity<List<Department>> getList(){
		List<Department> list = service.getList();
		if(list!=null) {
			return new ResponseEntity<List<Department>>(list,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<List<Department>>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	@DeleteMapping("/department/{deptId}")
	public ResponseEntity<?> removeViaId(@PathVariable int deptId){
		this.service.deleteById(deptId);
		return new ResponseEntity<>("Your Department has been deleted !! "+deptId, HttpStatus.OK);
	}
	
	
	@PostMapping(value="/savejobRole1")
	public ResponseEntity<JobRole> savejobRole1(@RequestBody JobRole jobRole1_id){
		JobRole j1 = service.savejobRole1(jobRole1_id);
		if(j1!=null) {
			return new ResponseEntity<JobRole>(j1,HttpStatus.CREATED);
		}
		else {
			return new ResponseEntity<JobRole>(HttpStatus.INTERNAL_SERVER_ERROR);
		}		
	}
	
	
	@GetMapping(value="/getjobRole1/{jobRole1Id}")
	public ResponseEntity<JobRole> getJobRole1(@PathVariable int jobRole1_id){
		JobRole j1 = service.getJobRole1(jobRole1_id);
		if(j1!=null) {
			return new ResponseEntity<JobRole>(j1,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<JobRole>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	@GetMapping(value="/getListofjobRole1")
	public ResponseEntity<List<JobRole>> getListofJobRole1(){
		List<JobRole> listjobRole1 = service.getListofJobRole1();
		if(listjobRole1!=null) {
			return new ResponseEntity<List<JobRole>>(listjobRole1,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<List<JobRole>>(HttpStatus.NOT_FOUND);
		}
		
	}

}
