package com.dr.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class Blog implements Serializable {
	

	private static final long serialVersionUID = 1586284515096347351L;
	
	private Long bid;
	
	private String title;
	private Timestamp pubtime;
	private String tags;//tags拼接字符串存放
	private Integer blogtype;
	private String url;
	
	
	private Users users;//存此篇blog的用户
	private Users olduser;//写blog的用户
	private Folder folder;
	
	private Bloginfo bloginfo;//blog信息
	
	
	
	
	
	
	
	
	
	
	
	

}
