package com.myxiaonei.domain;

// Generated 2018-2-28 14:05:53 by Hibernate Tools 3.4.0.CR1

/**
 * Link generated by hbm2java
 */
public class Link implements java.io.Serializable {

	private Integer LId;
	private String LName;
	private String LImgName;
	private String LUrl;

	public Link() {
	}

	public Link(String LName, String LImgName, String LUrl) {
		this.LName = LName;
		this.LImgName = LImgName;
		this.LUrl = LUrl;
	}

	public Integer getLId() {
		return this.LId;
	}

	public void setLId(Integer LId) {
		this.LId = LId;
	}

	public String getLName() {
		return this.LName;
	}

	public void setLName(String LName) {
		this.LName = LName;
	}

	public String getLImgName() {
		return this.LImgName;
	}

	public void setLImgName(String LImgName) {
		this.LImgName = LImgName;
	}

	public String getLUrl() {
		return this.LUrl;
	}

	public void setLUrl(String LUrl) {
		this.LUrl = LUrl;
	}

}
