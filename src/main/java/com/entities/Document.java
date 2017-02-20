package com.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="document")
public class Document {
	private String document_name;
	private Date submit_date;
	private Date deleted_date;
	private Date downloaded_date;
	private String document_detail;
	public String getDocument_name() {
		return document_name;
	}
	public void setDocument_name(String document_name) {
		this.document_name = document_name;
	}
	public Date getSubmit_date() {
		return submit_date;
	}
	public void setSubmit_date(Date submit_date) {
		this.submit_date = submit_date;
	}
	public Date getDeleted_date() {
		return deleted_date;
	}
	public void setDeleted_date(Date deleted_date) {
		this.deleted_date = deleted_date;
	}
	public Date getDownloaded_date() {
		return downloaded_date;
	}
	public void setDownloaded_date(Date downloaded_date) {
		this.downloaded_date = downloaded_date;
	}
	public String getDocument_detail() {
		return document_detail;
	}
	public void setDocument_detail(String document_detail) {
		this.document_detail = document_detail;
	}
	
	
	
	
}
