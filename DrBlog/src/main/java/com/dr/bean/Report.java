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

	public Long getRepid() {
		return repid;
	}

	public void setRepid(Long repid) {
		this.repid = repid;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getReporttime() {
		return reporttime;
	}

	public void setReporttime(Timestamp reporttime) {
		this.reporttime = reporttime;
	}

	public Blog getBlog() {
		return blog;
	}

	public void setBlog(Blog blog) {
		this.blog = blog;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((blog == null) ? 0 : blog.hashCode());
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((repid == null) ? 0 : repid.hashCode());
		result = prime * result + ((reporttime == null) ? 0 : reporttime.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Report other = (Report) obj;
		if (blog == null) {
			if (other.blog != null)
				return false;
		} else if (!blog.equals(other.blog))
			return false;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (repid == null) {
			if (other.repid != null)
				return false;
		} else if (!repid.equals(other.repid))
			return false;
		if (reporttime == null) {
			if (other.reporttime != null)
				return false;
		} else if (!reporttime.equals(other.reporttime))
			return false;
		return true;
	}

	public Report(Long repid, String content, Timestamp reporttime, Blog blog) {
		super();
		this.repid = repid;
		this.content = content;
		this.reporttime = reporttime;
		this.blog = blog;
	}

	public Report() {
		super();
	}

	@Override
	public String toString() {
		return "Report [repid=" + repid + ", content=" + content + ", reporttime=" + reporttime + ", blog=" + blog
				+ "]";
	}
	
	

}
