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

	/*��½ϵͳ����*/
	public User login(String name, String pwd) 
			throws NameOrPwdException,NullParamException{
			if(name == null || name.equals("") || 
				pwd==null || pwd.equals("")){
				throw new NullParamException("��¼��������Ϊ�գ�");
			}
			User user = userDao.findByName(name);
			if(user != null && pwd.equals(user.getPwd())){
				return user;
			}
			throw new NameOrPwdException("�û��������������");
	}
	
}