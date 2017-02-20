package com.fwd.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="email")
public class Email {
	private String employee_name;
	private String employee_email;
	
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public String getEmployee_email() {
		return employee_email;
	}
	public void setEmployee_email(String employee_email) {
		this.employee_email = employee_email;
	}
		
}
