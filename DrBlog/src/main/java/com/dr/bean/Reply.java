package com.dr.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class Reply implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1902396310128713977L;
	
	
	private Long reid;
	private String content;
	private Timestamp retime;
	private Long forid;
	
	private Blog blog;
	private Users user;

}
