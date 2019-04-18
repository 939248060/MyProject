package com.yungame.bean;

import java.util.Date;

public class Education {

	private int eduId;
	private String education;
	private String major;
	private Date graduationTime;
	private String graduationSchool;
	private String language;
	private employee emp;
	
	public Education() {
		super();
	}

	public Education(String education, String major, Date graduationTime, String graduationSchool,
			String language, employee emp) {
		super();
		this.education = education;
		this.major = major;
		this.graduationTime = graduationTime;
		this.graduationSchool = graduationSchool;
		this.language = language;
		this.emp = emp;
	}
	
	public employee getEmp() {
		return emp;
	}

	public void setEmp(employee emp) {
		this.emp = emp;
	}

	public int getEduId() {
		return eduId;
	}
	public void setEduId(int eduId) {
		this.eduId = eduId;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public Date getGraduationTime() {
		return graduationTime;
	}
	public void setGraduationTime(Date graduationTime) {
		this.graduationTime = graduationTime;
	}
	public String getGraduationSchool() {
		return graduationSchool;
	}
	public void setGraduationSchool(String graduationSchool) {
		this.graduationSchool = graduationSchool;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	
	
}
