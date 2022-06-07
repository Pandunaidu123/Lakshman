package com.ecom;

import java.io.Serializable;


public class ValidateUser implements Serializable {
	private String user, pass;


	public void setUser(String user) 
	{
		this.user = user;
	}

	public void setPass(String pass) 
	{ 
		this.pass = pass; 
	}

	public String getUser() 
	{
		return user; 
	}
	public String getPass() 
	{ 
		return pass; 
	}

	// Method to validate a user
	public boolean validate(String user, String pass)
	{
		if (user.equals(user) && pass.equals(pass))
			return true;
		else
			return false;
	}
	@Override
	public String toString() {
		return "ValidateUser [user=" + user + ", pass=" + pass + "]";
	}
}
