package com.yungame.service;



import com.yungame.bean.User;
import com.yungame.dao.UserDao;

public class UserService {

	private UserDao userDao;
	
	public boolean checkUser(String username, String password){
		return userDao.checkUser(username, password);
	}
	
	public User getUser(String username){
		return userDao.getUser(username);
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
}
