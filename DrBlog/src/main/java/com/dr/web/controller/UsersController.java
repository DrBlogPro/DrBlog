package com.dr.web.controller;


import java.io.File;
import java.io.IOException;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import com.dr.bean.Users;
import com.dr.biz.UsersBiz;



@Controller
public class UsersController {
	private static final Log logger=LogFactory.getLog(UsersController.class);
	
	private UsersBiz usersBiz;
	
	@Resource(name="usersBizImpl")
	public void setUsersBiz(UsersBiz usersBiz){
		this.usersBiz = usersBiz;
	}
	
	/**
	 * 用户登录判断
	 * @return
	 */
	@RequestMapping(value="user/signin")
	public String userSignIn(@RequestParam String email,@RequestParam String pwd,
			@ModelAttribute Users user,
			@RequestParam String validateCode,HttpSession session){
		
		logger.info("logining...");
		user.setEmail(email);
		user.setPassword(pwd);
		return null;	
	}
	
	@RequestMapping(value="person")
	public String person(){
		return "person";
	}
	
	@RequestMapping(value="login")
	public String login(){
		return "signInUp";
	}
}

