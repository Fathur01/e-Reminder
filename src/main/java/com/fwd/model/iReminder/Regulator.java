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
@Table(name="media")
public class Regulator {

	@Id
	@GenericGenerator(name="generator", strategy="increment")
	@GeneratedValue(generator="generator")
	
	@Column(name="report_id", columnDefinition="varchar(50)", nullable=true)
	private String reportId;
	
	@Column(name="regulator", columnDefinition="varchar(50)", nullable=true)
	private String regulator;
	
	@Column(name="report_name", columnDefinition="varchar(50)", nullable=true)
	private String reportName;

	public Regulator() {
		this.reportId = null; // ftr 28/07/2016
		this.regulator = null;
		this.reportName = null;
	}

	public String getReportId() {
		return reportId;
	}

	public void setReportId(String reportId) {
		this.reportId = reportId;
	}

	public String getRegulator() {
		return regulator;
	}

	public void setRegulator(String regulator) {
		this.regulator = regulator;
	}

	public String getReportName() {
		return reportName;
	}

	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	
	
}