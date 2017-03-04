package com.dr.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class Information implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2600343406929452711L;
	
	
	
	private Long ifid;

	private String title;
	private String content;
	private Timestamp sendtime;
	
	
	private Users user;

}
