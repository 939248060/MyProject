package com.yungame.actions;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.yungame.bean.Spouse;
import com.yungame.bean.employee;
import com.yungame.service.SpouseService;

public class SpouseAction extends ActionSupport{

	private SpouseService spService;

	//显示所有配偶信息
	private List<Spouse> spoList = null;
	//保存添加的配偶信息
	private Spouse spo = new Spouse();
	
	//id
	private String id;
	
	
	public Spouse getSpo() {
		return spo;
	}

	public void setSpo(Spouse spo) {
		this.spo = spo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Spouse> getSpoList() {
		return spoList;
	}

	public void setSpoList(List<Spouse> spoList) {
		this.spoList = spoList;
	}

	public SpouseService getSpService() {
		return spService;
	}

	public void setSpService(SpouseService spService) {
		this.spService = spService;
	}
	//显示全部配偶信息
	public String showAllSpoAction() {
		spoList = spService.getAll();
		return SUCCESS;
	}
	//添加配偶信息
	public String addSpoAction() {
		
		return "addPage";
	}
	//保存添加的配偶信息
	public String saveSpoAction() {
		employee emp = spService.getOneEmp(Integer.parseInt(id));
		emp.setSpouse(spo);
		spService.add(emp);
		return "dosuccess";
	}
	//显示一个配偶信息
	public String showSpoByIdAction() {
		spoList = new ArrayList<Spouse>();
		spoList.add(spService.getOneById(Integer.parseInt(id)));
		return SUCCESS;
	}
	//删除配偶信息
	public String deleteByIdAction() {
		spService.deleteById(Integer.parseInt(id));
		return SUCCESS;
	}
}
