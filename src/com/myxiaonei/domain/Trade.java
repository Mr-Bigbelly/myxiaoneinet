package com.myxiaonei.domain;

// Generated 2018-2-28 14:05:53 by Hibernate Tools 3.4.0.CR1

/**
 * Trade generated by hbm2java
 */
public class Trade implements java.io.Serializable {

	private Integer trId;
	private String trName;

	public Trade() {
	}

	public Trade(String trName) {
		this.trName = trName;
	}

	public Integer getTrId() {
		return this.trId;
	}

	public void setTrId(Integer trId) {
		this.trId = trId;
	}

	public String getTrName() {
		return this.trName;
	}

	public void setTrName(String trName) {
		this.trName = trName;
	}

}
