package com.dr.biz.impl;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.dr.bean.Users;
import com.dr.biz.UsersBiz;
import com.dr.dao.BaseDao;

@Service
public class UsersBizImpl implements UsersBiz {
	
	private BaseDao basedao;
	
	@Resource(name="baseDaoMybatisImpl")
	public void setBasedao(BaseDao basedao) {
		this.basedao = basedao;
	}
	
	
	@Override
	public List<Users> getLogin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getLogin1(Users users) {
		// TODO Auto-generated method stub

	}

	@Override
	public void singIn() {
		// TODO Auto-generated method stub

	}




	@Override
	public List<Users> getUserInfo() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List<Users> getAttention() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List<Users> getUserByWord() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void payBlogs() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void addMoney() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void replyBlog() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void uploadPhoto() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void activeUser() {
		// TODO Auto-generated method stub
		
	}

}
