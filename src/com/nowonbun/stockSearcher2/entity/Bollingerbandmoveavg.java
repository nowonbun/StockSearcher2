package com.nowonbun.stockSearcher2.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the bollingerbandmoveavg database table.
 * 
 */
@Entity
@NamedQuery(name="Bollingerbandmoveavg.findAll", query="SELECT b FROM Bollingerbandmoveavg b")
public class Bollingerbandmoveavg implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BollingerbandmoveavgPK id;

	private byte isuse;

	private BigInteger lowerline;

	private BigInteger mvAvg60;

	private BigInteger stDv;

	private BigInteger upperline;

	@Column(name="volume_price")
	private BigInteger volumePrice;

	//bi-directional many-to-one association to Stocklist
	@ManyToOne
	@JoinColumn(name="code")
	private Stocklist stocklist;

	public Bollingerbandmoveavg() {
	}

	public BollingerbandmoveavgPK getId() {
		return this.id;
	}

	public void setId(BollingerbandmoveavgPK id) {
		this.id = id;
	}

	public byte getIsuse() {
		return this.isuse;
	}

	public void setIsuse(byte isuse) {
		this.isuse = isuse;
	}

	public BigInteger getLowerline() {
		return this.lowerline;
	}

	public void setLowerline(BigInteger lowerline) {
		this.lowerline = lowerline;
	}

	public BigInteger getMvAvg60() {
		return this.mvAvg60;
	}

	public void setMvAvg60(BigInteger mvAvg60) {
		this.mvAvg60 = mvAvg60;
	}

	public BigInteger getStDv() {
		return this.stDv;
	}

	public void setStDv(BigInteger stDv) {
		this.stDv = stDv;
	}

	public BigInteger getUpperline() {
		return this.upperline;
	}

	public void setUpperline(BigInteger upperline) {
		this.upperline = upperline;
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