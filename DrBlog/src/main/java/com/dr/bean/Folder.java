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

	public Long getFid() {
		return fid;
	}

	public void setFid(Long fid) {
		this.fid = fid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Timestamp getNewtime() {
		return newtime;
	}

	public void setNewtime(Timestamp newtime) {
		this.newtime = newtime;
	}

	public String getFolderinfo() {
		return folderinfo;
	}

	public void setFolderinfo(String folderinfo) {
		this.folderinfo = folderinfo;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public List<Blog> getBlogs() {
		return blogs;
	}

	public void setBlogs(List<Blog> blogs) {
		this.blogs = blogs;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((blogs == null) ? 0 : blogs.hashCode());
		result = prime * result + ((fid == null) ? 0 : fid.hashCode());
		result = prime * result + ((folderinfo == null) ? 0 : folderinfo.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((newtime == null) ? 0 : newtime.hashCode());
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
		Folder other = (Folder) obj;
		if (blogs == null) {
			if (other.blogs != null)
				return false;
		} else if (!blogs.equals(other.blogs))
			return false;
		if (fid == null) {
			if (other.fid != null)
				return false;
		} else if (!fid.equals(other.fid))
			return false;
		if (folderinfo == null) {
			if (other.folderinfo != null)
				return false;
		} else if (!folderinfo.equals(other.folderinfo))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (newtime == null) {
			if (other.newtime != null)
				return false;
		} else if (!newtime.equals(other.newtime))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	public Folder(Long fid, String name, Timestamp newtime, String folderinfo, Users user, List<Blog> blogs) {
		super();
		this.fid = fid;
		this.name = name;
		this.newtime = newtime;
		this.folderinfo = folderinfo;
		this.user = user;
		this.blogs = blogs;
	}

	public Folder() {
		super();
	}

	@Override
	public String toString() {
		return "Folder [fid=" + fid + ", name=" + name + ", newtime=" + newtime + ", folderinfo=" + folderinfo
				+ ", user=" + user + ", blogs=" + blogs + "]";
	}
	
}
