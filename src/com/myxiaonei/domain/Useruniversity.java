package com.myxiaonei.domain;

// Generated 2018-2-28 14:05:53 by Hibernate Tools 3.4.0.CR1

/**
 * Useruniversity generated by hbm2java
 */
public class Useruniversity implements java.io.Serializable {

	private Integer id;
	private Integer userId;
	private Integer universityId;
	private Integer uniYear;
	private String userType;
	private String college;
	private String drom;

	public Useruniversity() {
	}

	public Useruniversity(Integer userId, Integer universityId,
			Integer uniYear, String userType, String college, String drom) {
		this.userId = userId;
		this.universityId = universityId;
		this.uniYear = uniYear;
		this.userType = userType;
		this.college = college;
		this.drom = drom;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getUniversityId() {
		return this.universityId;
	}

	public void setUniversityId(Integer universityId) {
		this.universityId = universityId;
	}

	public Integer getUniYear() {
		return this.uniYear;
	}

	public void setUniYear(Integer uniYear) {
		this.uniYear = uniYear;
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getCollege() {
		return this.college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getDrom() {
		return this.drom;
	}

	public void setDrom(String drom) {
		this.drom = drom;
	}

}