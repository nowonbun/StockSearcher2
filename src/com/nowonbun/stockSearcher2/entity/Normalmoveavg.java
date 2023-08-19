package com.nowonbun.stockSearcher2.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the normalmoveavg database table.
 * 
 */
@Entity
@NamedQuery(name="Normalmoveavg.findAll", query="SELECT n FROM Normalmoveavg n")
public class Normalmoveavg implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private NormalmoveavgPK id;

	private byte isuse;

	private BigInteger mvAvg120;

	private BigInteger mvAvg20;

	private BigInteger mvAvg240;

	private BigInteger mvAvg5;

	private BigInteger mvAvg60;

	@Column(name="volume_price")
	private BigInteger volumePrice;

	//bi-directional many-to-one association to Stocklist
	@ManyToOne
	@JoinColumn(name="code")
	private Stocklist stocklist;

	public Normalmoveavg() {
	}

	public NormalmoveavgPK getId() {
		return this.id;
	}

	public void setId(NormalmoveavgPK id) {
		this.id = id;
	}

	public byte getIsuse() {
		return this.isuse;
	}

	public void setIsuse(byte isuse) {
		this.isuse = isuse;
	}

	public BigInteger getMvAvg120() {
		return this.mvAvg120;
	}

	public void setMvAvg120(BigInteger mvAvg120) {
		this.mvAvg120 = mvAvg120;
	}

	public BigInteger getMvAvg20() {
		return this.mvAvg20;
	}

	public void setMvAvg20(BigInteger mvAvg20) {
		this.mvAvg20 = mvAvg20;
	}

	public BigInteger getMvAvg240() {
		return this.mvAvg240;
	}

	public void setMvAvg240(BigInteger mvAvg240) {
		this.mvAvg240 = mvAvg240;
	}

	public BigInteger getMvAvg5() {
		return this.mvAvg5;
	}

	public void setMvAvg5(BigInteger mvAvg5) {
		this.mvAvg5 = mvAvg5;
	}

	public BigInteger getMvAvg60() {
		return this.mvAvg60;
	}

	public void setMvAvg60(BigInteger mvAvg60) {
		this.mvAvg60 = mvAvg60;
	}

	public BigInteger getVolumePrice() {
		return this.volumePrice;
	}

	public void setVolumePrice(BigInteger volumePrice) {
		this.volumePrice = volumePrice;
	}

	public Stocklist getStocklist() {
		return this.stocklist;
	}

	public void setStocklist(Stocklist stocklist) {
		this.stocklist = stocklist;
	}

}