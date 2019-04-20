package com.yungame.dao;

import java.util.List;



import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


import com.yungame.bean.User;
import com.yungame.dao.impl.BasedaoImpl;

public class UserDao extends HibernateDaoSupport{
	private static List<User> users;
	public boolean checkUser(String username, String password){
		System.out.println(this.getHibernateTemplate());
		//System.out.println(username);
		List<User> user=this.getHibernateTemplate().find("from User where username = ? and password = ?", username,password);
		if(user!=null&&user.size()>0){
			return true;
		}else{
			return false;
		}		 
	}
	
	public User getUser(String username){
		List<User> users=this.getHibernateTemplate().find("from User where username = ?", username);
		for(User user : users){
			if(user.getUsername().equals(username)){
				return user;
			}
		}	
		return null;
	}
	
}
