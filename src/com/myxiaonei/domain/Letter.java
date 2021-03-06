package com.myxiaonei.domain;

// Generated 2018-2-28 14:05:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Letter generated by hbm2java
 */
public class Letter implements java.io.Serializable {

	private Long leId;
	private Long leSendId;
	private Long leGetId;
	private String leTitle;
	private String leContent;
	private Date leIndate;
	private Integer leReaded;

	public Letter() {
	}

	public Letter(Long leSendId, Long leGetId, String leTitle,
			String leContent, Date leIndate, Integer leReaded) {
		this.leSendId = leSendId;
		this.leGetId = leGetId;
		this.leTitle = leTitle;
		this.leContent = leContent;
		this.leIndate = leIndate;
		this.leReaded = leReaded;
	}

	public Long getLeId() {
		return this.leId;
	}

	public void setLeId(Long leId) {
		this.leId = leId;
	}

	public Long getLeSendId() {
		return this.leSendId;
	}

	public void setLeSendId(Long leSendId) {
		this.leSendId = leSendId;
	}

	public Long getLeGetId() {
		return this.leGetId;
	}

	public void setLeGetId(Long leGetId) {
		this.leGetId = leGetId;
	}

	public String getLeTitle() {
		return this.leTitle;
	}

	public void setLeTitle(String leTitle) {
		this.leTitle = leTitle;
	}

	public String getLeContent() {
		return this.leContent;
	}

	public void setLeContent(String leContent) {
		this.leContent = leContent;
	}

	public Date getLeIndate() {
		return this.leIndate;
	}

	public void setLeIndate(Date leIndate) {
		this.leIndate = leIndate;
	}

	public Integer getLeReaded() {
		return this.leReaded;
	}

	public void setLeReaded(Integer leReaded) {
		this.leReaded = leReaded;
	}

}
