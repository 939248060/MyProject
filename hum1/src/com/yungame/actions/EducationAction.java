package com.yungame.actions;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.yungame.bean.Education;
import com.yungame.bean.employee;
import com.yungame.service.EducationService;

public class EducationAction extends ActionSupport{

	private EducationService educationService;
    
	private List<Education> eduList = null;
	
	private String id;
	
	private Education education = new Education();
	
	
	public Education getEducation() {
		return education;
	}

	public void setEducation(Education education) {
		this.education = education;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Education> getEduList() {
		return eduList;
	}

	public void setEduList(List<Education> eduList) {
		this.eduList = eduList;
	}

	public EducationService getEducationService() {
		return educationService;
	}

	public void setEducationService(EducationService educationService) {
		this.educationService = educationService;
	}
	//查找全部学历信息
	public String findAllAction(){
		eduList = educationService.findEduAll();
		return SUCCESS;
	}
	//删除学历
	public String deleteEduAction() {
		if(id !=null || id.equals("")) {
			Education edu = new Education();
	        edu.setEduId(Integer.parseInt(id));
			educationService.delete(edu);
		}
		return "dosuccess";
	}
	//添加学历
	public String addEduAction() {
		return "AddEdu";
	}
	//保存添加的学历
	public String savaEduAction() {
		employee emp = educationService.GetEmp(Integer.parseInt(id));
		emp.setEducation(education);
		educationService.add(emp);
		return "addsuccess";
	}
	//查看一个员工学历
	public String showOneEduAction() {
		eduList = new ArrayList<Education>();
		eduList.add(educationService.findById(Integer.parseInt(id)));
		return SUCCESS;
	}
}
