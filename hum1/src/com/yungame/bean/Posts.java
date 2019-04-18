package com.yungame.bean;

public class Posts {

	private int pid;
	private String pname;
	private String explains;
	private department dept;
	private employee pemp;
	public Posts() {
		super();
	}
	public Posts(int pid, String pname, String explains) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.explains = explains;
		//this.dept = dept;
	}
	
	
	public employee getPemp() {
		return pemp;
	}
	public void setPemp(employee pemp) {
		this.pemp = pemp;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getExplains() {
		return explains;
	}
	public void setExplains(String explains) {
		this.explains = explains;
	}
	public department getDept() {
		return dept;
	}
	public void setDept(department dept) {
		this.dept = dept;
	}
	
}
