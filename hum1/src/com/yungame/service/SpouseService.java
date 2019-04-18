package com.yungame.service;
import java.util.List;

import com.yungame.bean.Spouse;
import com.yungame.bean.employee;
import com.yungame.dao.EmloyeeDao;
import com.yungame.dao.SpouseDao;

public class SpouseService {


	private SpouseDao spoDao;

	private EmloyeeDao empDao;
	
	
	public EmloyeeDao getEmpDao() {
		return empDao;
	}

	public void setEmpDao(EmloyeeDao empDao) {
		this.empDao = empDao;
	}

	public SpouseDao getSpoDao() {
		return spoDao;
	}

	public void setSpoDao(SpouseDao spoDao) {
		this.spoDao = spoDao;
	}
	
    public int add(employee emp) {
    	 empDao.updateEmp(emp);
    	 return 0;
    }
    
    public Spouse getOneById(int sid) {
    	return spoDao.getOneById(sid);
    }

    public List<Spouse> getAll(){
    	return spoDao.getAll();
    }
    
    public int deleteById(int sid) {
    	return spoDao.deleteById(sid);
    }
    public employee getOneEmp(int id){
    	return empDao.getOneEmp(id);
    }
}
