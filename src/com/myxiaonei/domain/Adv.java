package com.myxiaonei.domain;

// Generated 2018-2-28 14:05:53 by Hibernate Tools 3.4.0.CR1

/**
 * Adv generated by hbm2java
 */
public class Adv implements java.io.Serializable {

	private Integer adId;
	private String adName;
	private String adImgName;
	private String adUrl;

	public Adv() {
	}

	public Adv(String adName, String adImgName, String adUrl) {
		this.adName = adName;
		this.adImgName = adImgName;
		this.adUrl = adUrl;
	}

	public Integer getAdId() {
		return this.adId;
	}

	public void setAdId(Integer adId) {
		this.adId = adId;
	}

	public String getAdName() {
		return this.adName;
	}

	public void setAdName(String adName) {
		this.adName = adName;
	}

	public String getAdImgName() {
		return this.adImgName;
	}

	public void setAdImgName(String adImgName) {
		this.adImgName = adImgName;
	}

	public String getAdUrl() {
		return this.adUrl;
	}

	public void setAdUrl(String adUrl) {
		this.adUrl = adUrl;
	}

}