package com.ffk.dao;

import com.ffk.entity.User;

/**
 * 
* @ClassName: UserDao 
* @Description: TODO�û����ʽӿ�
* @author A18ccms a18ccms_gmail_com 
* @date 2015��5��20�� ����9:34:33 
*
 */
public interface UserDao {
	public User findByName(String name);
	//public User add(String name,String pwd,String phone);
}
