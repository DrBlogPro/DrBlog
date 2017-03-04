package com.dr.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class Reply implements Serializable {
	private static final long serialVersionUID = -1902396310128713977L;
	
	
	private Long reid;
	private String content;
	private Timestamp retime;
	private Long forid;
	
	private Blog blog;
	private Users user;
	public Long getReid() {
		return reid;
	}
	public void setReid(Long reid) {
		this.reid = reid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getRetime() {
		return retime;
	}
	public void setRetime(Timestamp retime) {
		this.retime = retime;
	}
	public Long getForid() {
		return forid;
	}
	public void setForid(Long forid) {
		this.forid = forid;
	}
	public Blog getBlog() {
		return blog;
	}
	public void setBlog(Blog blog) {
		this.blog = blog;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((blog == null) ? 0 : blog.hashCode());
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((forid == null) ? 0 : forid.hashCode());
		result = prime * result + ((reid == null) ? 0 : reid.hashCode());
		result = prime * result + ((retime == null) ? 0 : retime.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		Reply other = (Reply) obj;
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
		if (forid == null) {
			if (other.forid != null)
				return false;
		} else if (!forid.equals(other.forid))
			return false;
		if (reid == null) {
			if (other.reid != null)
				return false;
		} else if (!reid.equals(other.reid))
			return false;
		if (retime == null) {
			if (other.retime != null)
				return false;
		} else if (!retime.equals(other.retime))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
	public Reply(Long reid, String content, Timestamp retime, Long forid, Blog blog, Users user) {
		super();
		this.reid = reid;
		this.content = content;
		this.retime = retime;
		this.forid = forid;
		this.blog = blog;
		this.user = user;
	}
	public Reply() {
		super();
	}
	@Override
	public String toString() {
		return "Reply [reid=" + reid + ", content=" + content + ", retime=" + retime + ", forid=" + forid + ", blog="
				+ blog + ", user=" + user + "]";
	}
	
}
