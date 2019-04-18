package com.yungame.interceptors;

import java.util.Map;


import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import com.yungame.bean.User;

public class AuthInterceptor extends MethodFilterInterceptor {

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		Map<String, Object> session = invocation.getInvocationContext().getSession();
		
		User user = (User)session.get("user");
		
		if(user == null){
			 return Action.LOGIN;
		}		
		return invocation.invoke();
	}

}
