package com.im.struts.actions;

import com.opensymphony.xwork2.ActionSupport;

public class MemberAction extends ActionSupport{
String un,pw, name;
	
String msg = "";	


	//non argumented 
	
public String getMsg() {
	return msg;
}


public void setMsg(String msg) {
	this.msg = msg;
}


public void validate() {
	if(un.length()<2) {
		addFieldError("un", "User Name must have two characters min");
	}
	
	if(pw.length()<2) {
		addFieldError("pw", "Password is not strong");
	}
	
	
}


	public String getUn() {
		return un;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setUn(String un) {
		this.un = un;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	public String register() {
		System.out.println("called..");
		try {
			System.out.println("Name= "+name);
			System.out.println("UserName= "+un);
			System.out.println("Password= "+pw);
			msg = "Registration success";
			return SUCCESS;
			
			
			
		}catch(Exception e) {
			return ERROR;
		}
	}
	
	
	public String login() {
		System.out.println("called..");
		try {
			if(un.contentEquals("admin")&& pw.contentEquals("654")) {
				
				return SUCCESS;
			}else {
				
				return NONE;
			}
			
			
			
		}catch(Exception e) {
			
			return ERROR;
		}
	}
}
