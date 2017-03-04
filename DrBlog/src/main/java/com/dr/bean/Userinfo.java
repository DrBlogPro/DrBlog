package com.dr.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class Userinfo implements Serializable {
	private static final long serialVersionUID = 7592125303615191620L;
	
	
	private Long uiid;
	private String photo;
	private String introduce;
	private Integer illegal;
	private Integer status;
	private BigDecimal money;
	
	private Users users;

	public Long getUiid() {
		return uiid;
	}

	public void setUiid(Long uiid) {
		this.uiid = uiid;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public Integer getIllegal() {
		return illegal;
	}

	public void setIllegal(Integer illegal) {
		this.illegal = illegal;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public BigDecimal getMoney() {
		return money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Userinfo(Long uiid, String photo, String introduce, Integer illegal, Integer status, BigDecimal money,
			Users users) {
		super();
		this.uiid = uiid;
		this.photo = photo;
		this.introduce = introduce;
		this.illegal = illegal;
		this.status = status;
		this.money = money;
		this.users = users;
	}

	public Userinfo() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((illegal == null) ? 0 : illegal.hashCode());
		result = prime * result + ((introduce == null) ? 0 : introduce.hashCode());
		result = prime * result + ((money == null) ? 0 : money.hashCode());
		result = prime * result + ((photo == null) ? 0 : photo.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((uiid == null) ? 0 : uiid.hashCode());
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
		Userinfo other = (Userinfo) obj;
		if (illegal == null) {
			if (other.illegal != null)
				return false;
		} else if (!illegal.equals(other.illegal))
			return false;
		if (introduce == null) {
			if (other.introduce != null)
				return false;
		} else if (!introduce.equals(other.introduce))
			return false;
		if (money == null) {
			if (other.money != null)
				return false;
		} else if (!money.equals(other.money))
			return false;
		if (photo == null) {
			if (other.photo != null)
				return false;
		} else if (!photo.equals(other.photo))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (uiid == null) {
			if (other.uiid != null)
				return false;
		} else if (!uiid.equals(other.uiid))
			return false;
		if (users == null) {
			if (other.users != null)
				return false;
		} else if (!users.equals(other.users))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Userinfo [uiid=" + uiid + ", photo=" + photo + ", introduce=" + introduce + ", illegal=" + illegal
				+ ", status=" + status + ", money=" + money + ", users=" + users + "]";
	}
	
	
	
	
	
	

}
