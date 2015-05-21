package com.ffk.dao;

import com.ffk.entity.User;

/**
 * 
* @ClassName: UserDao 
* @Description: TODO用户访问接口
* @author A18ccms a18ccms_gmail_com 
* @date 2015年5月20日 上午9:34:33 
*
 */
public interface UserDao {
	public User findByName(String name);
	//public User add(String name,String pwd,String phone);
}
