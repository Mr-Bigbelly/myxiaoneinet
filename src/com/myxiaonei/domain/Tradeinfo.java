package com.myxiaonei.domain;

// Generated 2018-2-28 14:05:53 by Hibernate Tools 3.4.0.CR1

/**
 * Tradeinfo generated by hbm2java
 */
public class Tradeinfo implements java.io.Serializable {

	private Integer tiId;
	private String tiName;
	private Integer tiTraId;

	public Tradeinfo() {
	}

	public Tradeinfo(String tiName, Integer tiTraId) {
		this.tiName = tiName;
		this.tiTraId = tiTraId;
	}

	public Integer getTiId() {
		return this.tiId;
	}

	public void setTiId(Integer tiId) {
		this.tiId = tiId;
	}

	public String getTiName() {
		return this.tiName;
	}

	public void setTiName(String tiName) {
		this.tiName = tiName;
	}

	public Integer getTiTraId() {
		return this.tiTraId;
	}

	public void setTiTraId(Integer tiTraId) {
		this.tiTraId = tiTraId;
	}

}
