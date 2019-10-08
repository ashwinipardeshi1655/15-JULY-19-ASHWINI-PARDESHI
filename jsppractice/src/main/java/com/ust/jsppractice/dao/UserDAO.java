package com.ust.jsppractice.dao;

import com.ust.jsppractice.dto.UserInfoBean;

public interface UserDAO {
	
	public UserInfoBean login(int id,String password);
	public void register();

}
