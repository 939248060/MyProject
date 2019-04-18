package com.yungame.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.yungame.bean.Posts;
import com.yungame.bean.department;
import com.yungame.bean.employee;
import com.yungame.dao.DepartmentDao;
import com.yungame.dao.EmloyeeDao;

public class EmpService {

	private EmloyeeDao EmpDao;
	private DepartmentDao DepDao;
	
    //获得全部的员工信息
	public List<employee> getEmp(){
		return EmpDao.getEmp();
	}

    //获取一个员工的的信息
	public employee getOneEmp(Integer id){
		return EmpDao.getOneEmp(id);
	}
	
	
	//获取所有部门
	public List<department> getAllDep(){
		return DepDao.getDep();
	}
	//得到一个部门
	public department getOneDep(Integer id){
		return DepDao.getOneDep(id);
	}
	//保存修改
	public void SavaEmp(employee emp){
		EmpDao.SavaEmp(emp);   
	}
	
	//更新员工
	public void updateEmp(employee emp) {
		EmpDao.updateEmp(emp);
	}
	//删除一个员工
	public void DeleteEmp(employee emp){
		EmpDao.DeleteEmp(emp);	
	}
	
	//保存新添加的员工
	public void AddEmp(employee emp){
		EmpDao.AddEmp(emp);
	}
	//根据部门id获取对应的岗位信息
	public List<Posts> getPosById(int id){
		department dep = DepDao.getOneDep(id);
		Set<Posts> posSet = dep.getPos();
		List<Posts> result = new ArrayList<Posts>(posSet);
		return result;
	}
		
		
		
		
	public void setEmpDao(EmloyeeDao empDao) {
		EmpDao = empDao;
	}

	public void setDepDao(DepartmentDao depDao) {
		DepDao = depDao;
	}
	
}
