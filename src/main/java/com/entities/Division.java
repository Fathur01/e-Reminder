package com.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="division")
public class Division {
	private String employee_name;
	private String department;
	private String division;
	private String authority_level;
	
	
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getAuthority_level() {
		return authority_level;
	}
	public void setAuthority_level(String authority_level) {
		this.authority_level = authority_level;
	}
	
	
}
