package com.example.labo01.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "country_serie")
public class Country_Serie {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "countryID")
	private Integer iCountryID;

	@Column(name = "serieID")
	private Integer iSerieID;

	@Column(name = "YR2005")
	private Double i2005;
	@Column(name = "YR2006")
	private Double i2006;
	@Column(name = "YR2007")
	private Double i2007;
	@Column(name = "YR2008")
	private Double i2008;
	@Column(name = "YR2009")
	private Double i2009;
	@Column(name = "YR2010")
	private Double i2010;
	@Column(name = "YR2011")
	private Double i2011;
	@Column(name = "YR2012")
	private Double i2012;
	@Column(name = "YR2013")
	private Double i2013;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getiCountryID() {
		return iCountryID;
	}

	public void setiCountryID(Integer iCountryID) {
		this.iCountryID = iCountryID;
	}

	public Integer getiSerieID() {
		return iSerieID;
	}

	public void setiSerieID(Integer iSerieID) {
		this.iSerieID = iSerieID;
	}


	public Double getI2005() {
		return i2005;
	}

	public void setI2005(Double i2005) {
		this.i2005 = i2005;
	}

	public Double getI2006() {
		return i2006;
	}

	public void setI2006(Double i2006) {
		this.i2006 = i2006;
	}

	public Double getI2007() {
		return i2007;
	}

	public void setI2007(Double i2007) {
		this.i2007 = i2007;
	}

	public Double getI2008() {
		return i2008;
	}

	public void setI2008(Double i2008) {
		this.i2008 = i2008;
	}

	public Double getI2009() {
		return i2009;
	}

	public void setI2009(Double i2009) {
		this.i2009 = i2009;
	}

	public Double getI2010() {
		return i2010;
	}

	public void setI2010(Double i2010) {
		this.i2010 = i2010;
	}

	public Double getI2011() {
		return i2011;
	}

	public void setI2011(Double i2011) {
		this.i2011 = i2011;
	}

	public Double getI2012() {
		return i2012;
	}

	public void setI2012(Double i2012) {
		this.i2012 = i2012;
	}

	public Double getI2013() {
		return i2013;
	}

	public void setI2013(Double i2013) {
		this.i2013 = i2013;
	}

	public Country_Serie() {
		super();
	}

}
