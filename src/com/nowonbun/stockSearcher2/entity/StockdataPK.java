package com.nowonbun.stockSearcher2.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the stockdata database table.
 * 
 */
@Embeddable
public class StockdataPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private String code;

	private long timestamp;

	public StockdataPK() {
	}
	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof StockdataPK)) {
			return false;
		}
		StockdataPK castOther = (StockdataPK)other;
		return 
			this.code.equals(castOther.code)
			&& (this.timestamp == castOther.timestamp);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.code.hashCode();
		hash = hash * prime + ((int) (this.timestamp ^ (this.timestamp >>> 32)));
		
		return hash;
	}
}