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
public class Media {

	@Id
	@GenericGenerator(name="generator", strategy="increment")
	@GeneratedValue(generator="generator")
	
	@Column(name="report_id", columnDefinition="varchar(50)", nullable=true)
	private String reportId;
	
	@Column(name="report_media", columnDefinition="varchar(50)", nullable=true)
	private String reportMedia; 

	public Media() {
		this.reportId = null; // ftr 28/07/2016
		this.reportMedia = null;
	}

	public String getReportId() {
		return reportId;
	}

	public void setReportId(String reportId) {
		this.reportId = reportId;
	}

	public String getReportMedia() {
		return reportMedia;
	}

	public void setReportMedia(String reportMedia) {
		this.reportMedia = reportMedia;
	}

	
	
}