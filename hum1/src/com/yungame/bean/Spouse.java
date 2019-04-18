package com.yungame.bean;

public class Spouse {

	private int sid;
	private String sname;
	private Integer age;
	private String sex;
	private String job;
	private String workplace;
	private employee emp;
	public Spouse() {
		super();
	}
	public Spouse(int sid, String sname, Integer age, String sex, String job, String workplace) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.age = age;
		this.sex = sex;
		this.job = job;
		this.workplace = workplace;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getWorkplace() {
		return workplace;
	}
	public void setWorkplace(String workplace) {
		this.workplace = workplace;
	}
	public employee getEmp() {
		return emp;
	}
	public void setEmp(employee emp) {
		this.emp = emp;
	}
	
	
}
