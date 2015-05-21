package com.ffk.test;

import java.util.Properties;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ffk.dao.jdbcDataSource;
import com.ffk.entity.User;
import com.ffk.service.UserService;

public class TestCase {

	@Test
	public void testUserService() throws Exception{
		String cfg = "spring-mvc.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(cfg);
		Properties obj = ac.getBean("jdbcProps",Properties.class);
		jdbcDataSource ds = ac.getBean("jdbcDataSource",jdbcDataSource.class);
		System.out.println(obj);
		System.out.println(ds);
		System.out.println(ds.getConnection());
		UserService service = ac.getBean("userService", UserService.class); 
		User user = service.login("Tom", "123");
		System.out.println(user); 
	}
	
}
