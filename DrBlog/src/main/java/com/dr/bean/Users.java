package com.dr.bean;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

public class Users implements Serializable{
	
	private static final long serialVersionUID = -5819701530170254403L;
	
	
	private Long uid;
	private String email;
	private String touchphone;
	private String username;
	private String password;
	private Timestamp signtime;
	private String sex;
	
	
	private Userinfo userinfo;
	private List<Blog> blogs;
	private List<Folder> folders;
	private List<Information> information;
	private List<Attention> attention;
	private List<Reply> reply;
	
	
	
	
	
	

}
