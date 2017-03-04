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
	public Long getUid() {
		return uid;
	}
	public void setUid(Long uid) {
		this.uid = uid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTouchphone() {
		return touchphone;
	}
	public void setTouchphone(String touchphone) {
		this.touchphone = touchphone;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Timestamp getSigntime() {
		return signtime;
	}
	public void setSigntime(Timestamp signtime) {
		this.signtime = signtime;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Userinfo getUserinfo() {
		return userinfo;
	}
	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}
	public List<Blog> getBlogs() {
		return blogs;
	}
	public void setBlogs(List<Blog> blogs) {
		this.blogs = blogs;
	}
	public List<Folder> getFolders() {
		return folders;
	}
	public void setFolders(List<Folder> folders) {
		this.folders = folders;
	}
	public List<Information> getInformation() {
		return information;
	}
	public void setInformation(List<Information> information) {
		this.information = information;
	}
	public List<Attention> getAttention() {
		return attention;
	}
	public void setAttention(List<Attention> attention) {
		this.attention = attention;
	}
	public List<Reply> getReply() {
		return reply;
	}
	public void setReply(List<Reply> reply) {
		this.reply = reply;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((attention == null) ? 0 : attention.hashCode());
		result = prime * result + ((blogs == null) ? 0 : blogs.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((folders == null) ? 0 : folders.hashCode());
		result = prime * result + ((information == null) ? 0 : information.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((reply == null) ? 0 : reply.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		result = prime * result + ((signtime == null) ? 0 : signtime.hashCode());
		result = prime * result + ((touchphone == null) ? 0 : touchphone.hashCode());
		result = prime * result + ((uid == null) ? 0 : uid.hashCode());
		result = prime * result + ((userinfo == null) ? 0 : userinfo.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		Users other = (Users) obj;
		if (attention == null) {
			if (other.attention != null)
				return false;
		} else if (!attention.equals(other.attention))
			return false;
		if (blogs == null) {
			if (other.blogs != null)
				return false;
		} else if (!blogs.equals(other.blogs))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (folders == null) {
			if (other.folders != null)
				return false;
		} else if (!folders.equals(other.folders))
			return false;
		if (information == null) {
			if (other.information != null)
				return false;
		} else if (!information.equals(other.information))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (reply == null) {
			if (other.reply != null)
				return false;
		} else if (!reply.equals(other.reply))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		if (signtime == null) {
			if (other.signtime != null)
				return false;
		} else if (!signtime.equals(other.signtime))
			return false;
		if (touchphone == null) {
			if (other.touchphone != null)
				return false;
		} else if (!touchphone.equals(other.touchphone))
			return false;
		if (uid == null) {
			if (other.uid != null)
				return false;
		} else if (!uid.equals(other.uid))
			return false;
		if (userinfo == null) {
			if (other.userinfo != null)
				return false;
		} else if (!userinfo.equals(other.userinfo))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	public Users(Long uid, String email, String touchphone, String username, String password, Timestamp signtime,
			String sex, Userinfo userinfo, List<Blog> blogs, List<Folder> folders, List<Information> information,
			List<Attention> attention, List<Reply> reply) {
		super();
		this.uid = uid;
		this.email = email;
		this.touchphone = touchphone;
		this.username = username;
		this.password = password;
		this.signtime = signtime;
		this.sex = sex;
		this.userinfo = userinfo;
		this.blogs = blogs;
		this.folders = folders;
		this.information = information;
		this.attention = attention;
		this.reply = reply;
	}
	public Users() {
		super();
	}
	@Override
	public String toString() {
		return "Users [uid=" + uid + ", email=" + email + ", touchphone=" + touchphone + ", username=" + username
				+ ", password=" + password + ", signtime=" + signtime + ", sex=" + sex + ", userinfo=" + userinfo
				+ ", blogs=" + blogs + ", folders=" + folders + ", information=" + information + ", attention="
				+ attention + ", reply=" + reply + "]";
	}
	
}
