package com.dr.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class Report implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5732613784285794908L;
	
	private Long repid;
	private String content;
	private Timestamp reporttime;
	
	private Blog blog;

}
