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

	public Long getBid() {
		return bid;
	}

	public void setBid(Long bid) {
		this.bid = bid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Timestamp getPubtime() {
		return pubtime;
	}

	public void setPubtime(Timestamp pubtime) {
		this.pubtime = pubtime;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public Integer getBlogtype() {
		return blogtype;
	}

	public void setBlogtype(Integer blogtype) {
		this.blogtype = blogtype;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Users getOlduser() {
		return olduser;
	}

	public void setOlduser(Users olduser) {
		this.olduser = olduser;
	}

	public Folder getFolder() {
		return folder;
	}

	public void setFolder(Folder folder) {
		this.folder = folder;
	}

	public Bloginfo getBloginfo() {
		return bloginfo;
	}

	public void setBloginfo(Bloginfo bloginfo) {
		this.bloginfo = bloginfo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bid == null) ? 0 : bid.hashCode());
		result = prime * result + ((bloginfo == null) ? 0 : bloginfo.hashCode());
		result = prime * result + ((blogtype == null) ? 0 : blogtype.hashCode());
		result = prime * result + ((folder == null) ? 0 : folder.hashCode());
		result = prime * result + ((olduser == null) ? 0 : olduser.hashCode());
		result = prime * result + ((pubtime == null) ? 0 : pubtime.hashCode());
		result = prime * result + ((tags == null) ? 0 : tags.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		result = prime * result + ((users == null) ? 0 : users.hashCode());
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
		Blog other = (Blog) obj;
		if (bid == null) {
			if (other.bid != null)
				return false;
		} else if (!bid.equals(other.bid))
			return false;
		if (bloginfo == null) {
			if (other.bloginfo != null)
				return false;
		} else if (!bloginfo.equals(other.bloginfo))
			return false;
		if (blogtype == null) {
			if (other.blogtype != null)
				return false;
		} else if (!blogtype.equals(other.blogtype))
			return false;
		if (folder == null) {
			if (other.folder != null)
				return false;
		} else if (!folder.equals(other.folder))
			return false;
		if (olduser == null) {
			if (other.olduser != null)
				return false;
		} else if (!olduser.equals(other.olduser))
			return false;
		if (pubtime == null) {
			if (other.pubtime != null)
				return false;
		} else if (!pubtime.equals(other.pubtime))
			return false;
		if (tags == null) {
			if (other.tags != null)
				return false;
		} else if (!tags.equals(other.tags))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		if (users == null) {
			if (other.users != null)
				return false;
		} else if (!users.equals(other.users))
			return false;
		return true;
	}

	public Blog(Long bid, String title, Timestamp pubtime, String tags, Integer blogtype, String url, Users users,
			Users olduser, Folder folder, Bloginfo bloginfo) {
		super();
		this.bid = bid;
		this.title = title;
		this.pubtime = pubtime;
		this.tags = tags;
		this.blogtype = blogtype;
		this.url = url;
		this.users = users;
		this.olduser = olduser;
		this.folder = folder;
		this.bloginfo = bloginfo;
	}

	public Blog() {
		super();
	}

	@Override
	public String toString() {
		return "Blog [bid=" + bid + ", title=" + title + ", pubtime=" + pubtime + ", tags=" + tags + ", blogtype="
				+ blogtype + ", url=" + url + ", users=" + users + ", olduser=" + olduser + ", folder=" + folder
				+ ", bloginfo=" + bloginfo + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
