package com.yungame.bean;

import java.util.HashSet;
import java.util.Set;

public class department {

	private Integer id;
	private String departmentname;
	private String adderss;
	private String manager;//部门主任
	private Set<Posts> pos = new HashSet<Posts>();
	private Set<employee> emp=new HashSet<employee>();

	
	public Set<Posts> getPos() {
		return pos;
	}
	public void setPos(Set<Posts> pos) {
		this.pos = pos;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDepartmentname() {
		return departmentname;
	}
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
	public String getAdderss() {
		return adderss;
	}
	public void setAdderss(String adderss) {
		this.adderss = adderss;
	}
	public Set<employee> getEmp() {
		return emp;
	}
	public void setEmp(Set<employee> emp) {
		this.emp = emp;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
		
}
