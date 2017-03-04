package com.dr.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class Information implements Serializable {
	private static final long serialVersionUID = -2600343406929452711L;
	
	private Long ifid;
	private String title;
	private String content;
	private Timestamp sendtime;
	
	private Users user;

	public Long getIfid() {
		return ifid;
	}

	public void setIfid(Long ifid) {
		this.ifid = ifid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getSendtime() {
		return sendtime;
	}

	public void setSendtime(Timestamp sendtime) {
		this.sendtime = sendtime;
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
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((ifid == null) ? 0 : ifid.hashCode());
		result = prime * result + ((sendtime == null) ? 0 : sendtime.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Information other = (Information) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (ifid == null) {
			if (other.ifid != null)
				return false;
		} else if (!ifid.equals(other.ifid))
			return false;
		if (sendtime == null) {
			if (other.sendtime != null)
				return false;
		} else if (!sendtime.equals(other.sendtime))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	public Information(Long ifid, String title, String content, Timestamp sendtime, Users user) {
		super();
		this.ifid = ifid;
		this.title = title;
		this.content = content;
		this.sendtime = sendtime;
		this.user = user;
	}

	public Information() {
		super();
	}

	@Override
	public String toString() {
		return "Information [ifid=" + ifid + ", title=" + title + ", content=" + content + ", sendtime=" + sendtime
				+ ", user=" + user + "]";
	}
	
	

}
