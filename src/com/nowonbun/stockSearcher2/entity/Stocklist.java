package com.nowonbun.stockSearcher2.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the stocklist database table.
 * 
 */
@Entity
@NamedQuery(name="Stocklist.findAll", query="SELECT s FROM Stocklist s")
public class Stocklist implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String code;

	private String date;

	private String name;

	private String stockcode;

	private String type17code;

	private String type33code;

	private String typescalecode;

	//bi-directional many-to-one association to Bollingerbandmoveavg
	@OneToMany(mappedBy="stocklist")
	private List<Bollingerbandmoveavg> bollingerbandmoveavgs;

	//bi-directional many-to-one association to Fibonachimoveavg
	@OneToMany(mappedBy="stocklist")
	private List<Fibonachimoveavg> fibonachimoveavgs;

	//bi-directional many-to-one association to Normalmoveavg
	@OneToMany(mappedBy="stocklist")
	private List<Normalmoveavg> normalmoveavgs;

	//bi-directional many-to-one association to Stockdata
	@OneToMany(mappedBy="stocklist")
	private List<Stockdata> stockdata;

	public Stocklist() {
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStockcode() {
		return this.stockcode;
	}

	public void setStockcode(String stockcode) {
		this.stockcode = stockcode;
	}

	public String getType17code() {
		return this.type17code;
	}

	public void setType17code(String type17code) {
		this.type17code = type17code;
	}

	public String getType33code() {
		return this.type33code;
	}

	public void setType33code(String type33code) {
		this.type33code = type33code;
	}

	public String getTypescalecode() {
		return this.typescalecode;
	}

	public void setTypescalecode(String typescalecode) {
		this.typescalecode = typescalecode;
	}

	public List<Bollingerbandmoveavg> getBollingerbandmoveavgs() {
		return this.bollingerbandmoveavgs;
	}

	public void setBollingerbandmoveavgs(List<Bollingerbandmoveavg> bollingerbandmoveavgs) {
		this.bollingerbandmoveavgs = bollingerbandmoveavgs;
	}

	public Bollingerbandmoveavg addBollingerbandmoveavg(Bollingerbandmoveavg bollingerbandmoveavg) {
		getBollingerbandmoveavgs().add(bollingerbandmoveavg);
		bollingerbandmoveavg.setStocklist(this);

		return bollingerbandmoveavg;
	}

	public Bollingerbandmoveavg removeBollingerbandmoveavg(Bollingerbandmoveavg bollingerbandmoveavg) {
		getBollingerbandmoveavgs().remove(bollingerbandmoveavg);
		bollingerbandmoveavg.setStocklist(null);

		return bollingerbandmoveavg;
	}

	public List<Fibonachimoveavg> getFibonachimoveavgs() {
		return this.fibonachimoveavgs;
	}

	public void setFibonachimoveavgs(List<Fibonachimoveavg> fibonachimoveavgs) {
		this.fibonachimoveavgs = fibonachimoveavgs;
	}

	public Fibonachimoveavg addFibonachimoveavg(Fibonachimoveavg fibonachimoveavg) {
		getFibonachimoveavgs().add(fibonachimoveavg);
		fibonachimoveavg.setStocklist(this);

		return fibonachimoveavg;
	}

	public Fibonachimoveavg removeFibonachimoveavg(Fibonachimoveavg fibonachimoveavg) {
		getFibonachimoveavgs().remove(fibonachimoveavg);
		fibonachimoveavg.setStocklist(null);

		return fibonachimoveavg;
	}

	public List<Normalmoveavg> getNormalmoveavgs() {
		return this.normalmoveavgs;
	}

	public void setNormalmoveavgs(List<Normalmoveavg> normalmoveavgs) {
		this.normalmoveavgs = normalmoveavgs;
	}

	public Normalmoveavg addNormalmoveavg(Normalmoveavg normalmoveavg) {
		getNormalmoveavgs().add(normalmoveavg);
		normalmoveavg.setStocklist(this);

		return normalmoveavg;
	}

	public Normalmoveavg removeNormalmoveavg(Normalmoveavg normalmoveavg) {
		getNormalmoveavgs().remove(normalmoveavg);
		normalmoveavg.setStocklist(null);

		return normalmoveavg;
	}

	public List<Stockdata> getStockdata() {
		return this.stockdata;
	}

	public void setStockdata(List<Stockdata> stockdata) {
		this.stockdata = stockdata;
	}

	public Stockdata addStockdata(Stockdata stockdata) {
		getStockdata().add(stockdata);
		stockdata.setStocklist(this);

		return stockdata;
	}

	public Stockdata removeStockdata(Stockdata stockdata) {
		getStockdata().remove(stockdata);
		stockdata.setStocklist(null);

		return stockdata;
	}

}