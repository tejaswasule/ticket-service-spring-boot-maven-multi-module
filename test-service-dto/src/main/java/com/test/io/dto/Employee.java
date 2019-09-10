package com.test.io.dto;

public class Employee {
	public Long employeeID;
	public String name;
	public String designation;
	public Long managerEmployeeId; 
	public Department department;
	
	
	
	public Long getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(Long employeeID) {
		this.employeeID = employeeID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Long getManagerEmployeeId() {
		return managerEmployeeId;
	}
	public void setManagerEmployeeId(Long managerEmployeeId) {
		this.managerEmployeeId = managerEmployeeId;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	

}
