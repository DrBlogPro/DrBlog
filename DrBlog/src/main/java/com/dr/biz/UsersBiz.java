package com.dr.biz;

import java.util.List;
import com.dr.bean.Users;



public interface UsersBiz {
	
	List<Users> getLogin();//登录
	void getLogin1(Users users);//登录？用哪个
	
	List<Users> getUserInfo();//个人中心,获取个人信息
	
	List<Users> getAttention();//获取关注用户列表
	
	List<Users> getUserByWord();//搜索用户，正则
	
	void payBlogs();//打赏,修改自己的账户余额
	
	void addMoney();//充值账户余额
	
	void replyBlog();//评论blog，可回复评论
	
	void uploadPhoto();//上传头像
	
	void singIn();//注册,users
	
	
	
	
	void activeUser();//redis,活跃用户+1
	
	/*redis
	void browseHistory();//redis插blog浏览记录
	void goodHistory();//插点赞blog记录
	void badHistory();//插踩blog记录
	void moneyHistory();//插打赏blog记录
	*/
	
	

}
