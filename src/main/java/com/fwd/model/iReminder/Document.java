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
@Table(name="document")
public class Document {

	@Id
	@GenericGenerator(name="generator", strategy="increment")
	@GeneratedValue(generator="generator")
	
	@Column(name="document_name", columnDefinition="nvarchar(50)", length=50 , nullable=true)
	private String documentName;
	
	@Column(name="submit_date", columnDefinition="datetime", nullable=true)
	private Date submitDate; 
	
	@Column(name="deleted_date", columnDefinition="datetime", nullable=true)
	private Date deletedDate; 
	
	@Column(name="downloaded_date", columnDefinition="datetime", nullable=true)
	private Date downloadedDate; 
	
	@Column(name="document_detail", columnDefinition = "nvarchar(255)", nullable=true)
	private String documentDetail;

	public Document() {
		this.documentName = null; // ftr 28/07/2016
		this.submitDate = null;
		this.deletedDate = null;
		this.downloadedDate = null;
		this.documentDetail= null;
	}

	public Date getSubmitDate() {
		return submitDate;
	}

	public void setSubmitDate(Date submitDate) {
		this.submitDate = submitDate;
	}

	public Date getDeletedDate() {
		return deletedDate;
	}

	public void setDeletedDate(Date deletedDate) {
		this.deletedDate = deletedDate;
	}

	public Date getDownloadedDate() {
		return downloadedDate;
	}

	public void setDownloadedDate(Date downloadedDate) {
		this.downloadedDate = downloadedDate;
	}

	public String getDocumentDetail() {
		return documentDetail;
	}

	public void setDocumentDetail(String documentDetail) {
		this.documentDetail = documentDetail;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	public String getDocumentName() {
		return documentName;
	}

	
	
	
}