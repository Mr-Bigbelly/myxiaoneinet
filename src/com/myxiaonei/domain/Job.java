package com.myxiaonei.domain;

// Generated 2018-2-28 14:05:53 by Hibernate Tools 3.4.0.CR1

/**
 * Job generated by hbm2java
 */
public class Job implements java.io.Serializable {

	private Integer JId;
	private String JName;

	public Job() {
	}

	public Job(String JName) {
		this.JName = JName;
	}

	public Integer getJId() {
		return this.JId;
	}

	public void setJId(Integer JId) {
		this.JId = JId;
	}

	public String getJName() {
		return this.JName;
	}

	public void setJName(String JName) {
		this.JName = JName;
	}

}
