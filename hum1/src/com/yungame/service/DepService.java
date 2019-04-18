package com.yungame.service;

import java.util.List;

import com.yungame.bean.department;
import com.yungame.dao.DepartmentDao;

public class DepService {

	private DepartmentDao DepDao;
	
	//获取所有的部门的数据，进行显示
	public List<department> getDep(){
		return DepDao.getDep();
	}
	//修改的时候调用这个方法获取选中的id
	public department getOneDep(Integer id){
		return DepDao.getOneDep(id);
	}
	
	//修改保存
	public void SavaDep(department depart){
		 DepDao.SavaDep(depart);
	}
	//增加一个部门
	public void AddDep(department depart){
		DepDao.AddDep(depart);
	}
	//删除一个部门
	public void DeleteDep(department depart){
		DepDao.DeleteDep(depart);		
	}
	public void setDepDao(DepartmentDao depDao) {
		DepDao = depDao;
	}
}
