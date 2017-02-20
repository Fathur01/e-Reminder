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
@Table(name="pic")
public class Pic {

	@Id
	@GenericGenerator(name="generator", strategy="increment")
	@GeneratedValue(generator="generator")
	
	@Column(name="employee_name", columnDefinition="varchar(50)", nullable=true)
	private String employeeName;
	
	@Column(name="authority_level", columnDefinition="varchar(50)", nullable=true)
	private String authorityLevel; 
	
	@Column(name="approval", columnDefinition="varchar(50)", nullable=true)
	private String approval; 
	
	@Column(name="assign", columnDefinition="varchar(50)", nullable=true)
	private String assign; 

	@Column(name="report_name", columnDefinition="varchar(50)", nullable=true)
	private String reportName;
	
	@Column(name="regulator", columnDefinition="varchar(50)", nullable=true)
	private String regulator;
	
	@Column(name="report_period", columnDefinition="varchar(50)", nullable=true)
	private String reportPeriod;
	
	@Column(name="report_deadline", columnDefinition="varchar(50)", nullable=true)
	private String reportDeadline;
	
	@Column(name="report_media", columnDefinition="varchar(50)", nullable=true)
	private String reportMedia;
	
	@Column(name="role_based", columnDefinition="varchar(50)", nullable=true)
	private String roleBased;
	
	@Column(name="remark", columnDefinition="varchar(50)", nullable=true)
	private String remark; 
	
	public Pic() {
		this.employeeName = null; // ftr 28/07/2016
		this.authorityLevel = null;
		this.approval = null;
		this.assign = null;
		this.reportName= null;
		this.regulator = null;
		this.reportPeriod = null;
		this.reportDeadline = null;
		this.reportMedia = null;
		this.roleBased = null;
		this.remark = null;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getAuthorityLevel() {
		return authorityLevel;
	}

	public void setAuthorityLevel(String authorityLevel) {
		this.authorityLevel = authorityLevel;
	}

	public String getApproval() {
		return approval;
	}

	public void setApproval(String approval) {
		this.approval = approval;
	}

	public String getAssign() {
		return assign;
	}

	public void setAssign(String assign) {
		this.assign = assign;
	}

	public String getReportName() {
		return reportName;
	}

	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	public String getRegulator() {
		return regulator;
	}

	public void setRegulator(String regulator) {
		this.regulator = regulator;
	}

	public String getReportPeriod() {
		return reportPeriod;
	}

	public void setReportPeriod(String reportPeriod) {
		this.reportPeriod = reportPeriod;
	}

	public String getReportDeadline() {
		return reportDeadline;
	}

	public void setReportDeadline(String reportDeadline) {
		this.reportDeadline = reportDeadline;
	}

	public String getReportMedia() {
		return reportMedia;
	}

	public void setReportMedia(String reportMedia) {
		this.reportMedia = reportMedia;
	}

	public String getRoleBased() {
		return roleBased;
	}

	public void setRoleBased(String roleBased) {
		this.roleBased = roleBased;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	
}