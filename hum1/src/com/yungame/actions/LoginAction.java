package com.yungame.actions;

import java.util.Map;


import org.apache.struts2.interceptor.SessionAware;
import org.springframework.stereotype.Service;

import com.opensymphony.xwork2.ActionSupport;
import com.yungame.bean.User;
import com.yungame.dao.UserDao;
import com.yungame.service.UserService;
public class LoginAction extends ActionSupport implements SessionAware{
	private String username;
	private String password;
	private Map<String, Object> session;
	private UserService userService;	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String login(){	
		if(userService.checkUser(username, password)){
			User user = userService.getUser(username);
			session.put("user", user);
			return SUCCESS;			
		} else {
			this.addActionError("用户名或密码错误！");
			return LOGIN;
		}		
		
	}
	public String loginOut() {
		session.put("user", null);
		return LOGIN;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;		
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
