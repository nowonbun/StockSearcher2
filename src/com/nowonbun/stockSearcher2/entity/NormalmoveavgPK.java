package com.nowonbun.stockSearcher2.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the normalmoveavg database table.
 * 
 */
@Embeddable
public class NormalmoveavgPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private String code;

	@Temporal(TemporalType.DATE)
	private java.util.Date date;

	public NormalmoveavgPK() {
	}
	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public java.util.Date getDate() {
		return this.date;
	}
	public void setDate(java.util.Date date) {
		this.date = date;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof NormalmoveavgPK)) {
			return false;
		}
		NormalmoveavgPK castOther = (NormalmoveavgPK)other;
		return 
			this.code.equals(castOther.code)
			&& this.date.equals(castOther.date);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.code.hashCode();
		hash = hash * prime + this.date.hashCode();
		
		return hash;
	}
}