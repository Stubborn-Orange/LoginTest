package com.ffk.service;

import java.io.Serializable;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ffk.dao.UserDao;
import com.ffk.entity.User;

@Service
public class UserService implements Serializable{

	private UserDao userDao;

	@Resource(name="userDao")
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
		
	public UserDao getUserDao() {
		return userDao;
	}

	/*登陆系统功能*/
	public User login(String name, String pwd) 
			throws NameOrPwdException,NullParamException{
			if(name == null || name.equals("") || 
				pwd==null || pwd.equals("")){
				throw new NullParamException("登录参数不能为空！");
			}
			User user = userDao.findByName(name);
			if(user != null && pwd.equals(user.getPwd())){
				return user;
			}
			throw new NameOrPwdException("用户名或者密码错误");
	}
	
}
