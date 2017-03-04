package com.dr.bean;

import java.io.Serializable;

public class Tags implements Serializable {
	private static final long serialVersionUID = 6606451385147547530L;
	
	
	private Long tagid;
	private String name;
	public Long getTagid() {
		return tagid;
	}
	public void setTagid(Long tagid) {
		this.tagid = tagid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((tagid == null) ? 0 : tagid.hashCode());
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
		Tags other = (Tags) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (tagid == null) {
			if (other.tagid != null)
				return false;
		} else if (!tagid.equals(other.tagid))
			return false;
		return true;
	}
	public Tags(Long tagid, String name) {
		super();
		this.tagid = tagid;
		this.name = name;
	}
	public Tags() {
		super();
	}
	@Override
	public String toString() {
		return "Tags [tagid=" + tagid + ", name=" + name + "]";
	}
	
	

}
