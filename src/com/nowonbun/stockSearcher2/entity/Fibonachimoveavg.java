package com.nowonbun.stockSearcher2.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the fibonachimoveavg database table.
 * 
 */
@Entity
@NamedQuery(name="Fibonachimoveavg.findAll", query="SELECT f FROM Fibonachimoveavg f")
public class Fibonachimoveavg implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FibonachimoveavgPK id;

	private byte isuse;

	private BigInteger mvAvg13;

	private BigInteger mvAvg144;

	private BigInteger mvAvg21;

	private BigInteger mvAvg233;

	private BigInteger mvAvg34;

	private BigInteger mvAvg5;

	private BigInteger mvAvg55;

	private BigInteger mvAvg8;

	private BigInteger mvAvg89;

	@Column(name="volume_price")
	private BigInteger volumePrice;

	//bi-directional many-to-one association to Stocklist
	@ManyToOne
	@JoinColumn(name="code")
	private Stocklist stocklist;

	public Fibonachimoveavg() {
	}

	public FibonachimoveavgPK getId() {
		return this.id;
	}

	public void setId(FibonachimoveavgPK id) {
		this.id = id;
	}

	public byte getIsuse() {
		return this.isuse;
	}

	public void setIsuse(byte isuse) {
		this.isuse = isuse;
	}

	public BigInteger getMvAvg13() {
		return this.mvAvg13;
	}

	public void setMvAvg13(BigInteger mvAvg13) {
		this.mvAvg13 = mvAvg13;
	}

	public BigInteger getMvAvg144() {
		return this.mvAvg144;
	}

	public void setMvAvg144(BigInteger mvAvg144) {
		this.mvAvg144 = mvAvg144;
	}

	public BigInteger getMvAvg21() {
		return this.mvAvg21;
	}

	public void setMvAvg21(BigInteger mvAvg21) {
		this.mvAvg21 = mvAvg21;
	}

	public BigInteger getMvAvg233() {
		return this.mvAvg233;
	}

	public void setMvAvg233(BigInteger mvAvg233) {
		this.mvAvg233 = mvAvg233;
	}

	public BigInteger getMvAvg34() {
		return this.mvAvg34;
	}

	public void setMvAvg34(BigInteger mvAvg34) {
		this.mvAvg34 = mvAvg34;
	}

	public BigInteger getMvAvg5() {
		return this.mvAvg5;
	}

	public void setMvAvg5(BigInteger mvAvg5) {
		this.mvAvg5 = mvAvg5;
	}

	public BigInteger getMvAvg55() {
		return this.mvAvg55;
	}

	public void setMvAvg55(BigInteger mvAvg55) {
		this.mvAvg55 = mvAvg55;
	}

	public BigInteger getMvAvg8() {
		return this.mvAvg8;
	}

	public void setMvAvg8(BigInteger mvAvg8) {
		this.mvAvg8 = mvAvg8;
	}

	public BigInteger getMvAvg89() {
		return this.mvAvg89;
	}

	public void setMvAvg89(BigInteger mvAvg89) {
		this.mvAvg89 = mvAvg89;
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