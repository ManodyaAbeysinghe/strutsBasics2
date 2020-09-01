package com.im.struts.actions;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LogIntercapter extends AbstractInterceptor{

	public String intercept(ActionInvocation invocation) throws Exception{
		
		System.out.println("Action called...(Pre processing)");
		String result = invocation.invoke();
		System.out.println("Action called...(post processing)");
		return result;
	}
}
