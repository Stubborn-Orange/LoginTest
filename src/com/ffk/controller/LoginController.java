package com.ffk.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ffk.entity.User;
import com.ffk.service.NameOrPwdException;
import com.ffk.service.NullParamException;
import com.ffk.service.UserService;


@Controller
@RequestMapping("/login")
public class LoginController {

	@Resource//请求spring注入资源userService
	private UserService userService;
	
	@RequestMapping("/login.form")
	public String loginForm(){
		//可以向表单界面传递一些参数
		
		return "login-form";
	}
	
	@RequestMapping("/login-action1.form")
	//spring mvc 自动参数注入HttpServletRequest
	public String checkLogin1(HttpServletRequest req){
		System.out.println("--方法1--");
		String name = req.getParameter("name");
		String pwd = req.getParameter("pwd");
		System.out.println(name);
		System.out.println(pwd);
		try {
			User user = userService.login(name, pwd);
			req.getSession().setAttribute("user", user);
			System.out.println(user);
			return "success";
		} catch (NameOrPwdException e) {
			e.printStackTrace();
			req.setAttribute("message", e.getMessage());
			return "login-form";
		} catch (NullParamException e) {
			e.printStackTrace();
			req.setAttribute("message", e.getMessage());
			return "login-form";
			
		}catch (RuntimeException e) {
			e.printStackTrace();
			req.setAttribute("message", e.getMessage());
			return "error";
		}
	}
	
	@RequestMapping("/login-action2.form")
	public String checkLogin2(String name,
			@RequestParam("pwd") String password,//映射扁担属性不同的参数
			HttpServletRequest req){
		System.out.println("--方法2--");
		System.out.println(name);
		System.out.println(password);
		try {
			User user = userService.login(name, password);
			req.getSession().setAttribute("user", user);
			return "success";
		} catch (NameOrPwdException e) {
			e.printStackTrace();
			req.setAttribute("message", e.getMessage());
			return "login-form";
		} catch (NullParamException e) {
			e.printStackTrace();
			req.setAttribute("message", e.getMessage());
			return "login-form";
			
		}catch (RuntimeException e) {
			e.printStackTrace();
			req.setAttribute("message", e.getMessage());
			return "error";
		}
	}
}
