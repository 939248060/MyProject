package com.yungame.service;

import java.util.List;

import com.yungame.bean.Posts;
import com.yungame.dao.DepartmentDao;
import com.yungame.dao.PostsDao;

public class PostsService {


	private PostsDao posDao;
	
	private DepartmentDao depDao;
    
	public DepartmentDao getDepDao() {
		return depDao;
	}

	public void setDepDao(DepartmentDao depDao) {
		this.depDao = depDao;
	}

	public PostsDao getPosDao() {
		return posDao;
	}

	public void setPosDao(PostsDao posDao) {
		this.posDao = posDao;
	}
	//添加岗位方法
	public int AddPos(Posts posts) {
		posDao.add(posts);
		return 0;
	}
    //查找岗位
	public List<Posts> getDepPos(int id){
		return posDao.getDepPos(depDao.getOneDep(id));
	}
	//获取一个岗位
	public Posts getOnePos(int id) {
		return posDao.getPosById(id);
	}
	//删除一个员工
	public int deletePost(int id) {
		
		return posDao.deletePos(id);
	}
}
