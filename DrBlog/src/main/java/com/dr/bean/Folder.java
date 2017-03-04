package com.dr.bean;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

public class Folder implements Serializable {

	private static final long serialVersionUID = -6021153596461505478L;
	
	
	private Long fid;
	private String name;
	private Timestamp newtime;
	private String folderinfo;
	
	private Users user;
	
	private List<Blog> blogs;


	
	
	
	
	
	

}
