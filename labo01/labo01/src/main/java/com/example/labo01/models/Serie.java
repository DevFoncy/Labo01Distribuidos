package com.example.labo01.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "serie")
public class Serie {
	
	@Id
    @Column(name = "ID")
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
	
	@Column(name = "serieName")
	  private String sSerieName;
	  
    @Column(name = "serieCode")
	  private String sSerieCode;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getsSerieName() {
		return sSerieName;
	}

	public void setsSerieName(String sSerieName) {
		this.sSerieName = sSerieName;
	}

	public String getsSerieCode() {
		return sSerieCode;
	}

	public void setsSerieCode(String sSerieCode) {
		this.sSerieCode = sSerieCode;
	}

	public Serie(long id, String sSerieName, String sSerieCode) {
		super();
		this.id = id;
		this.sSerieName = sSerieName;
		this.sSerieCode = sSerieCode;
	}
	  
	 public Serie() {
		super(); 
	 }

}
