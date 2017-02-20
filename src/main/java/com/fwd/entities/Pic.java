package com.fwd.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pic")
public class Pic {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="employee_name")
	private String employeeName;
	
	@Column(name="authority_level")
	private String authorityLevel;
	
	@Column(name="approval")
	private String approval;
	
	@Column(name="assign")
	private String assign;
	
	@Column(name="report_name")
	private String reportName;
	
	@Column(name="regulator")
	private String regulator;
	
	@Column(name="report_period")
	private String reportPeriod;
	
	@Column(name="report_deadline")
	private String reportDeadline;
	
	@Column(name="report_media")
	private String reportMedia;
	
	@Column(name="role_based")
	private String roleBased;
	
	@Column(name="remark")
	private String remark;
	
	@Column(name="report_id")
	private String reportId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getReportId() {
		return reportId;
	}

	public void setReportId(String reportId) {
		this.reportId = reportId;
	}
	
}
