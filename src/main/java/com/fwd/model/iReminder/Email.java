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
@Table(name="email")
public class Email {

	@Id
	@GenericGenerator(name="generator", strategy="increment")
	@GeneratedValue(generator="generator")
	
	@Column(name="employee_name", columnDefinition="varchar(50)", nullable=true)
	private String employeeName;
	
	@Column(name="employee_email", columnDefinition="varchar(50)", nullable=true)
	private String employeeEmail; 

	public Email() {
		this.employeeName = null; // ftr 28/07/2016
		this.employeeEmail = null;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	
	
}