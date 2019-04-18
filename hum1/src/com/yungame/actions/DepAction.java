package com.yungame.actions;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.yungame.bean.department;
import com.yungame.service.DepService;
import com.yungame.service.PostsService;

public class DepAction extends ActionSupport{

	private String id;
	private department dp=new department();
	private DepService depService;
    private PostsService postsService;
	private List<department> Deplist;
	public String ShowDep(){
		Deplist=depService.getDep();
		return "ShowDep";	
	}
	
	//修改调用方法
	public String EditDep(){
		if(id!=null){
			int ids=Integer.parseInt(id);
			dp=depService.getOneDep(ids);
			return "EditDep";
		}else{
			return LOGIN;
			
	}	
	}
	//增加部门方法
	public String AddDep(){
		return "AddDep";
	}
	//保存增加
	public String SavaAddDep(){
		depService.AddDep(dp);
		return SUCCESS;
	}
	//保存修改部门信息
	public String SavaEditDep(){
		System.out.println(dp.getAdderss());
		depService.SavaDep(dp);
		return SUCCESS;
	}
   //删除一个部门
	public String DeleteDep(){
		if(id!=null){
		  depService.DeleteDep(depService.getOneDep(Integer.parseInt(id)));
		}
		
		return SUCCESS;
	}
	public void setDepService(DepService depService) {
		this.depService = depService;
	}


	public List<department> getDeplist() {
		return Deplist;
	}


	public void setDeplist(List<department> deplist) {
		Deplist = deplist;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public department getDp() {
		return dp;
	}

	public void setDp(department dp) {
		this.dp = dp;
	}

	public PostsService getPostsService() {
		return postsService;
	}

	public void setPostsService(PostsService postsService) {
		this.postsService = postsService;
	}

	


	
	
	
}
