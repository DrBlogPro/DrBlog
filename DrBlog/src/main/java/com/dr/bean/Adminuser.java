package com.dr.bean;

import java.io.Serializable;

public class Adminuser implements Serializable {
	

	private static final long serialVersionUID = -2836244604293295021L;
	
	private Long adid;

	private String uname;
	private String password;
	public Long getAdid() {
		return adid;
	}
	public void setAdid(Long adid) {
		this.adid = adid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Adminuser(Long adid, String uname, String password) {
		super();
		this.adid = adid;
		this.uname = uname;
		this.password = password;
	}
	public Adminuser() {
		super();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adid == null) ? 0 : adid.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((uname == null) ? 0 : uname.hashCode());
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
		Adminuser other = (Adminuser) obj;
		if (adid == null) {
			if (other.adid != null)
				return false;
		} else if (!adid.equals(other.adid))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (uname == null) {
			if (other.uname != null)
				return false;
		} else if (!uname.equals(other.uname))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Adminuser [adid=" + adid + ", uname=" + uname + ", password=" + password + "]";
	}
	
	
	
	

}
