package com.yungame.service;

import java.util.List;

import com.yungame.bean.Education;
import com.yungame.bean.employee;
import com.yungame.dao.EducationDao;
import com.yungame.dao.EmloyeeDao;

public class EducationService {

	private EducationDao educationDao;

	private EmloyeeDao empDao;
	
	

	public EmloyeeDao getEmpDao() {
		return empDao;
	}

	public void setEmpDao(EmloyeeDao empDao) {
		this.empDao = empDao;
	}

	public EducationDao getEducationDao() {
		return educationDao;
	}

	public void setEducationDao(EducationDao educationDao) {
		this.educationDao = educationDao;
	}
	public List<Education> findEduAll() {
		
		return educationDao.findall();			
	}
	
	public Education findById(int id) {
		return educationDao.findById(id);
	}
	//删除学历
	public int delete(Education edu) {
		educationDao.delete(edu);
		return 0;
	}
	//增加学历
	public int add(employee emp) {
		empDao.updateEmp(emp);
		return 0;
	}
	public int update(Education edu) {
		educationDao.update(edu);
		return 0;
	}
	
	public employee GetEmp(Integer id) {
		
		return empDao.getOneEmp(id);
	}
	
}
