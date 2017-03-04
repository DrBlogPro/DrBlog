package com.dr.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

public class CountInfo implements Serializable {

	private static final long serialVersionUID = 7122495730831993317L;
	
	private Long countid;
	private Date countdate;
	private Long active;
	private BigDecimal money;
	public Long getCountid() {
		return countid;
	}
	public void setCountid(Long countid) {
		this.countid = countid;
	}
	public Date getCountdate() {
		return countdate;
	}
	public void setCountdate(Date countdate) {
		this.countdate = countdate;
	}
	public Long getActive() {
		return active;
	}
	public void setActive(Long active) {
		this.active = active;
	}
	public BigDecimal getMoney() {
		return money;
	}
	public void setMoney(BigDecimal money) {
		this.money = money;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((active == null) ? 0 : active.hashCode());
		result = prime * result + ((countdate == null) ? 0 : countdate.hashCode());
		result = prime * result + ((countid == null) ? 0 : countid.hashCode());
		result = prime * result + ((money == null) ? 0 : money.hashCode());
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
		CountInfo other = (CountInfo) obj;
		if (active == null) {
			if (other.active != null)
				return false;
		} else if (!active.equals(other.active))
			return false;
		if (countdate == null) {
			if (other.countdate != null)
				return false;
		} else if (!countdate.equals(other.countdate))
			return false;
		if (countid == null) {
			if (other.countid != null)
				return false;
		} else if (!countid.equals(other.countid))
			return false;
		if (money == null) {
			if (other.money != null)
				return false;
		} else if (!money.equals(other.money))
			return false;
		return true;
	}
	public CountInfo(Long countid, Date countdate, Long active, BigDecimal money) {
		super();
		this.countid = countid;
		this.countdate = countdate;
		this.active = active;
		this.money = money;
	}
	public CountInfo() {
		super();
	}
	@Override
	public String toString() {
		return "CountInfo [countid=" + countid + ", countdate=" + countdate + ", active=" + active + ", money=" + money
				+ "]";
	}
	
	
}
