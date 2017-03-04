package com.dr.bean;

import java.io.Serializable;

public class Attention implements Serializable {
	
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = -3532132549139001874L;
	
	private Long atid;
	private Long attentionuid;
	
	private Users user;

	public Long getAtid() {
		return atid;
	}

	public void setAtid(Long atid) {
		this.atid = atid;
	}

	public Long getAttentionuid() {
		return attentionuid;
	}

	public void setAttentionuid(Long attentionuid) {
		this.attentionuid = attentionuid;
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
		result = prime * result + ((atid == null) ? 0 : atid.hashCode());
		result = prime * result + ((attentionuid == null) ? 0 : attentionuid.hashCode());
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
		Attention other = (Attention) obj;
		if (atid == null) {
			if (other.atid != null)
				return false;
		} else if (!atid.equals(other.atid))
			return false;
		if (attentionuid == null) {
			if (other.attentionuid != null)
				return false;
		} else if (!attentionuid.equals(other.attentionuid))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	public Attention(Long atid, Long attentionuid, Users user) {
		super();
		this.atid = atid;
		this.attentionuid = attentionuid;
		this.user = user;
	}

	public Attention() {
		super();
	}

	@Override
	public String toString() {
		return "Attention [atid=" + atid + ", attentionuid=" + attentionuid + ", user=" + user + "]";
	}
	
	
}
