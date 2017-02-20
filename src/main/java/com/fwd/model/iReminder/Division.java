package com.fwd.model.iReminder;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="division")
public class Division {

	@Id
	@GenericGenerator(name="generator", strategy="increment")
	@GeneratedValue(generator="generator")
	
	@Column(name="employee_name", columnDefinition="varchar(50)", length=50 , nullable=true)
	private String employeeName;
	
	@Column(name="department", columnDefinition="varchar(50)", nullable=true)
	private String department; 
	
	@Column(name="division", columnDefinition="varchar(50)", nullable=true)
	private String division; 
	
	@Column(name="authority_level", columnDefinition="varchar(50)", nullable=true)
	private String authorityLevel; 

	public Division() {
		this.employeeName = null; // ftr 28/07/2016
		this.department = null;
		this.division = null;
		this.authorityLevel = null;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
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

	public String getAuthorityLevel() {
		return authorityLevel;
	}

	public void setAuthorityLevel(String authorityLevel) {
		this.authorityLevel = authorityLevel;
	}
	
}