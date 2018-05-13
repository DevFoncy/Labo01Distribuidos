package com.example.labo01.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "country")
public class Country {
	  @Id
      @Column(name = "ID")
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
	  
	  @Column(name = "CountryName")
	  private String sCountryName;
	  
	  @Column(name = "CountryCode")
	  private String sCountryCode;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getsCountryName() {
		return sCountryName;
	}

	public void setsCountryName(String sCountryName) {
		this.sCountryName = sCountryName;
	}

	public String getsCountryCode() {
		return sCountryCode;
	}

	public void setsCountryCode(String sCountryCode) {
		this.sCountryCode = sCountryCode;
	}

	public Country(long id, String sCountryName, String sCountryCode) {
		super();
		this.id = id;
		this.sCountryName = sCountryName;
		this.sCountryCode = sCountryCode;
	}

	public Country() {
		super();
	}

	  
}
