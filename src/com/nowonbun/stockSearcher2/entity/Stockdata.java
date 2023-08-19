package com.nowonbun.stockSearcher2.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the stockdata database table.
 * 
 */
@Entity
@NamedQuery(name="Stockdata.findAll", query="SELECT s FROM Stockdata s")
public class Stockdata implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private StockdataPK id;

	@Column(name="closed_price")
	private BigInteger closedPrice;

	@Temporal(TemporalType.DATE)
	private Date date;

	@Column(name="high_price")
	private BigInteger highPrice;

	private byte isuse;

	@Column(name="low_price")
	private BigInteger lowPrice;

	@Column(name="open_price")
	private BigInteger openPrice;

	@Column(name="volume_price")
	private BigInteger volumePrice;

	//bi-directional many-to-one association to Stocklist
	@ManyToOne
	@JoinColumn(name="code")
	private Stocklist stocklist;

	public Stockdata() {
	}

	public StockdataPK getId() {
		return this.id;
	}

	public void setId(StockdataPK id) {
		this.id = id;
	}

	public BigInteger getClosedPrice() {
		return this.closedPrice;
	}

	public void setClosedPrice(BigInteger closedPrice) {
		this.closedPrice = closedPrice;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public BigInteger getHighPrice() {
		return this.highPrice;
	}

	public void setHighPrice(BigInteger highPrice) {
		this.highPrice = highPrice;
	}

	public byte getIsuse() {
		return this.isuse;
	}

	public void setIsuse(byte isuse) {
		this.isuse = isuse;
	}

	public BigInteger getLowPrice() {
		return this.lowPrice;
	}

	public void setLowPrice(BigInteger lowPrice) {
		this.lowPrice = lowPrice;
	}

	public BigInteger getOpenPrice() {
		return this.openPrice;
	}

	public void setOpenPrice(BigInteger openPrice) {
		this.openPrice = openPrice;
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