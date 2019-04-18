package com.yungame.actions;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.yungame.bean.Posts;
import com.yungame.bean.department;
import com.yungame.service.DepService;
import com.yungame.service.PostsService;

public class PostsAction extends ActionSupport{

	private PostsService posService;
	private DepService depService;
    private String id;
    private Posts posts = new Posts();
    private List<Posts> postsList;
    
    
	public List<Posts> getPostsList() {
		return postsList;
	}

	public void setPostsList(List<Posts> postsList) {
		this.postsList = postsList;
	}

	public DepService getDepService() {
		return depService;
	}

	public void setDepService(DepService depService) {
		this.depService = depService;
	}

	public Posts getPosts() {
		return posts;
	}

	public void setPosts(Posts posts) {
		this.posts = posts;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public PostsService getPosService() {
		return posService;
	}

	public void setPosService(PostsService posService) {
		this.posService = posService;
	}
	//添加方法
	public String addPosAction(){
		//当前的Id为部门传过来的部门Id
		
		return "addMet";
	}
	//保存添加的岗位
	public String savaPosAction() {
		department dep = depService.getOneDep(Integer.parseInt(id));
		posts.setDept(dep);
		posService.AddPos(posts);
		return "dosuccess";
	}
	//岗位展示
	public String showPosAction() {
		
		postsList = posService.getDepPos(Integer.parseInt(id));
		return SUCCESS;
	}
	//删除岗位
	public String deletePosAction() {
		
		posService.deletePost(Integer.parseInt(id));   
		return "dosuccess";
	}
}
