package com.dr.bean;

import java.io.Serializable;

public class Bloginfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 624103470565769677L;
	
	
	private Long bfid;

	private Integer status;
	private Long good;
	private Long bad;
	private Long browse;
	private Long pay;	
	private Long hot;
	
	private Blog blog;

	public Long getBfid() {
		return bfid;
	}

	public void setBfid(Long bfid) {
		this.bfid = bfid;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getGood() {
		return good;
	}

	public void setGood(Long good) {
		this.good = good;
	}

	public Long getBad() {
		return bad;
	}

	public void setBad(Long bad) {
		this.bad = bad;
	}

	public Long getBrowse() {
		return browse;
	}

	public void setBrowse(Long browse) {
		this.browse = browse;
	}

	public Long getPay() {
		return pay;
	}

	public void setPay(Long pay) {
		this.pay = pay;
	}

	public Long getHot() {
		return hot;
	}

	public void setHot(Long hot) {
		this.hot = hot;
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
		result = prime * result + ((bad == null) ? 0 : bad.hashCode());
		result = prime * result + ((bfid == null) ? 0 : bfid.hashCode());
		result = prime * result + ((blog == null) ? 0 : blog.hashCode());
		result = prime * result + ((browse == null) ? 0 : browse.hashCode());
		result = prime * result + ((good == null) ? 0 : good.hashCode());
		result = prime * result + ((hot == null) ? 0 : hot.hashCode());
		result = prime * result + ((pay == null) ? 0 : pay.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		Bloginfo other = (Bloginfo) obj;
		if (bad == null) {
			if (other.bad != null)
				return false;
		} else if (!bad.equals(other.bad))
			return false;
		if (bfid == null) {
			if (other.bfid != null)
				return false;
		} else if (!bfid.equals(other.bfid))
			return false;
		if (blog == null) {
			if (other.blog != null)
				return false;
		} else if (!blog.equals(other.blog))
			return false;
		if (browse == null) {
			if (other.browse != null)
				return false;
		} else if (!browse.equals(other.browse))
			return false;
		if (good == null) {
			if (other.good != null)
				return false;
		} else if (!good.equals(other.good))
			return false;
		if (hot == null) {
			if (other.hot != null)
				return false;
		} else if (!hot.equals(other.hot))
			return false;
		if (pay == null) {
			if (other.pay != null)
				return false;
		} else if (!pay.equals(other.pay))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}

	public Bloginfo(Long bfid, Integer status, Long good, Long bad, Long browse, Long pay, Long hot, Blog blog) {
		super();
		this.bfid = bfid;
		this.status = status;
		this.good = good;
		this.bad = bad;
		this.browse = browse;
		this.pay = pay;
		this.hot = hot;
		this.blog = blog;
	}

	public Bloginfo() {
		super();
	}

	@Override
	public String toString() {
		return "Bloginfo [bfid=" + bfid + ", status=" + status + ", good=" + good + ", bad=" + bad + ", browse="
				+ browse + ", pay=" + pay + ", hot=" + hot + ", blog=" + blog + "]";
	}
	
	
	
	
	
	
	
	
	

}
