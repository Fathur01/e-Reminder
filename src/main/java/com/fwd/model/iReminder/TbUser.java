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
@Table(name="tb_user")
public class TbUser {

	@Id
	@GenericGenerator(name="generator", strategy="increment")
	@GeneratedValue(generator="generator")
	
	@Column(name="id", columnDefinition="int", nullable=true)
	private int id;
	
	@Column(name="User_ID", columnDefinition="int", nullable=true)
	private int userId; 
	
	@Column(name="Role_ID", columnDefinition="int", nullable=true)
	private int roleId; 
	
	@Column(name="Dept_ID", columnDefinition="varchar(255)", nullable=true)
	private String deptId; 

	@Column(name="Sub_Dept_ID", columnDefinition="varchar(255)", nullable=true)
	private String subDeptId;
	
	@Column(name="Position_ID", columnDefinition="varchar(255)", nullable=true)
	private String positionId;
	
	@Column(name="UserTypeId", columnDefinition="int", nullable=true)
	private int userTypeId;
	
	@Column(name="BranchOfficeId", columnDefinition="int", nullable=true)
	private int branchOfficeId;
	
	@Column(name="UserName", columnDefinition="varchar(255)", nullable=true)
	private String userName;
	
	@Column(name="Password", columnDefinition="varchar(255)", nullable=true)
	private String password;
	
	@Column(name="First_Name", columnDefinition="varchar(255)", nullable=true)
	private String firstName;
	
	@Column(name="Last_Name", columnDefinition="varchar(255)", nullable=true)
	private String lastName;
	
	@Column(name="Employee_No", columnDefinition="varchar(255)", nullable=true)
	private String employeeNo;
	
	@Column(name="Email", columnDefinition="varchar(255)", nullable=true)
	private String email;
	
	@Column(name="Sex", columnDefinition="varchar(255)", nullable=true)
	private String sex;
	
	@Column(name="Picture_Profile", columnDefinition="varchar(255)", nullable=true)
	private String pictureProfile;
	
	@Column(name="Birth_Day_Date", columnDefinition="varchar(255)", nullable=true)
	private String birthDayDate;
	
	@Column(name="Status", columnDefinition="varchar(255)", nullable=true)
	private String status;
	
	@Column(name="Login_Count", columnDefinition="varchar(255)", nullable=true)
	private String loginCount;
	
	@Column(name="Comment_Count", columnDefinition="varchar(255)", nullable=true)
	private String commentCount;
	
	@Column(name="Read_Count", columnDefinition="varchar(255)", nullable=true)
	private String readCount;
	
	@Column(name="Create_Date", columnDefinition="varchar(255)", nullable=true)
	private String createDate;
	
	@Column(name="Create_By", columnDefinition="varchar(255)", nullable=true)
	private String createBy;
	
	@Column(name="CostCenter", columnDefinition="varchar(255)", nullable=true)
	private String costCenter;
	
	@Column(name="Picture_Profile_Thumb", columnDefinition="varchar(255)", nullable=true)
	private String pictureProfileThumb;
	
	@Column(name="Picture_Profile_Forum", columnDefinition="varchar(255)", nullable=true)
	private String pictureProfileForum;
	
	@Column(name="Last_Logged_On", columnDefinition="varchar(255)", nullable=true)
	private String lastLoggedOn;
	
	@Column(name="Ext_Number", columnDefinition="varchar(255)", nullable=true)
	private String extNumber;
	
	@Column(name="Phone_Number", columnDefinition="varchar(255)", nullable=true)
	private String phoneNumber;
	
	@Column(name="Mobile_Phone", columnDefinition="varchar(255)", nullable=true)
	private String mobilePhone;
	
	@Column(name="Description", columnDefinition="varchar(255)", nullable=true)
	private String description;
	
	@Column(name="Education_Desc", columnDefinition="varchar(255)", nullable=true)
	private String educationDesc;
	
	@Column(name="Work_Exp_Desc", columnDefinition="varchar(255)", nullable=true)
	private String workExpDesc;
	
	@Column(name="requestFasilityFK", columnDefinition="varchar(255)", nullable=true)
	private String requestFasilityFK;
	
	@Column(name="OTStatus", columnDefinition="int", nullable=true)
	private int OtStatus;
	
	@Column(name="AppOTID1", columnDefinition="int", nullable=true)
	private int appOTID1;
	
	@Column(name="AppOTID2", columnDefinition="int", nullable=true)
	private int appOTID2;
	
	@Column(name="AppOTID3", columnDefinition="varchar(255)", nullable=true)
	private String appOTID3;
	
	@Column(name="JoinDate", columnDefinition="varchar(255)", nullable=true)
	private String joinDate;
	
	
	
	
	public TbUser() {
		this.id = 0; // ftr 28/07/2016
		this.userId = 0;
		this.roleId = 0;
		this.deptId = null;
		this.subDeptId = null;
		this.positionId = null;
		this.userTypeId = 0;
		this.branchOfficeId = 0;
		this.userName = null;
		this.password = null;
		this.firstName = null;
		this.lastName = null;
		this.employeeNo = null;
		this.email = null;
		this.sex = null;
		this.pictureProfile = null;
		this.birthDayDate = null;
		this.status = null;
		this.loginCount = null;
		this.commentCount = null;
		this.readCount = null;
		this.createDate = null;
		this.createBy = null;
		this.costCenter = null;
		this.pictureProfileThumb = null;
		this.pictureProfileForum = null;
		this.lastLoggedOn = null;
		this.extNumber = null;
		this.phoneNumber = null;
		this.mobilePhone = null;
		this.description = null;
		this.educationDesc = null;
		this.workExpDesc = null;
		this.requestFasilityFK = null;
		this.OtStatus = 0;
		this.appOTID1 = 0;
		this.appOTID2 = 0;
		this.appOTID3 = null;
		this.joinDate = null;
		
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public int getUserId() {
		return userId;
	}




	public void setUserId(int userId) {
		this.userId = userId;
	}




	public int getRoleId() {
		return roleId;
	}




	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}




	public String getDeptId() {
		return deptId;
	}




	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}




	public String getSubDeptId() {
		return subDeptId;
	}




	public void setSubDeptId(String subDeptId) {
		this.subDeptId = subDeptId;
	}




	public String getPositionId() {
		return positionId;
	}




	public void setPositionId(String positionId) {
		this.positionId = positionId;
	}




	public int getUserTypeId() {
		return userTypeId;
	}




	public void setUserTypeId(int userTypeId) {
		this.userTypeId = userTypeId;
	}




	public int getBranchOfficeId() {
		return branchOfficeId;
	}




	public void setBranchOfficeId(int branchOfficeId) {
		this.branchOfficeId = branchOfficeId;
	}




	public String getUserName() {
		return userName;
	}




	public void setUserName(String userName) {
		this.userName = userName;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public String getFirstName() {
		return firstName;
	}




	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}




	public String getLastName() {
		return lastName;
	}




	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




	public String getEmployeeNo() {
		return employeeNo;
	}




	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getSex() {
		return sex;
	}




	public void setSex(String sex) {
		this.sex = sex;
	}




	public String getPictureProfile() {
		return pictureProfile;
	}




	public void setPictureProfile(String pictureProfile) {
		this.pictureProfile = pictureProfile;
	}




	public String getBirthDayDate() {
		return birthDayDate;
	}




	public void setBirthDayDate(String birthDayDate) {
		this.birthDayDate = birthDayDate;
	}




	public String getStatus() {
		return status;
	}




	public void setStatus(String status) {
		this.status = status;
	}




	public String getLoginCount() {
		return loginCount;
	}




	public void setLoginCount(String loginCount) {
		this.loginCount = loginCount;
	}




	public String getCommentCount() {
		return commentCount;
	}




	public void setCommentCount(String commentCount) {
		this.commentCount = commentCount;
	}




	public String getReadCount() {
		return readCount;
	}




	public void setReadCount(String readCount) {
		this.readCount = readCount;
	}




	public String getCreateDate() {
		return createDate;
	}




	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}




	public String getCreateBy() {
		return createBy;
	}




	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}




	public String getCostCenter() {
		return costCenter;
	}




	public void setCostCenter(String costCenter) {
		this.costCenter = costCenter;
	}




	public String getPictureProfileThumb() {
		return pictureProfileThumb;
	}




	public void setPictureProfileThumb(String pictureProfileThumb) {
		this.pictureProfileThumb = pictureProfileThumb;
	}




	public String getPictureProfileForum() {
		return pictureProfileForum;
	}




	public void setPictureProfileForum(String pictureProfileForum) {
		this.pictureProfileForum = pictureProfileForum;
	}




	public String getLastLoggedOn() {
		return lastLoggedOn;
	}




	public void setLastLoggedOn(String lastLoggedOn) {
		this.lastLoggedOn = lastLoggedOn;
	}




	public String getExtNumber() {
		return extNumber;
	}




	public void setExtNumber(String extNumber) {
		this.extNumber = extNumber;
	}




	public String getPhoneNumber() {
		return phoneNumber;
	}




	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}




	public String getMobilePhone() {
		return mobilePhone;
	}




	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}




	public String getDescription() {
		return description;
	}




	public void setDescription(String description) {
		this.description = description;
	}




	public String getEducationDesc() {
		return educationDesc;
	}




	public void setEducationDesc(String educationDesc) {
		this.educationDesc = educationDesc;
	}




	public String getWorkExpDesc() {
		return workExpDesc;
	}




	public void setWorkExpDesc(String workExpDesc) {
		this.workExpDesc = workExpDesc;
	}




	public String getRequestFasilityFK() {
		return requestFasilityFK;
	}




	public void setRequestFasilityFK(String requestFasilityFK) {
		this.requestFasilityFK = requestFasilityFK;
	}




	public int getOtStatus() {
		return OtStatus;
	}




	public void setOtStatus(int otStatus) {
		OtStatus = otStatus;
	}




	public int getAppOTID1() {
		return appOTID1;
	}




	public void setAppOTID1(int appOTID1) {
		this.appOTID1 = appOTID1;
	}




	public int getAppOTID2() {
		return appOTID2;
	}




	public void setAppOTID2(int appOTID2) {
		this.appOTID2 = appOTID2;
	}




	public String getAppOTID3() {
		return appOTID3;
	}




	public void setAppOTID3(String appOTID3) {
		this.appOTID3 = appOTID3;
	}




	public String getJoinDate() {
		return joinDate;
	}




	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

	
	
	
}