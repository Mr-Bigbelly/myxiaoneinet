package com.myxiaonei.domain;

// Generated 2018-2-28 14:05:53 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Country generated by hbm2java
 */

public class Country implements java.io.Serializable {
	
	private Integer id;
	private String name;
	private Set provinces = new HashSet(0);

	public Country() {
	}

	public Country(String name) {
		this.name = name;
	}

	public Country(String name, Set provinces) {
		this.name = name;
		this.provinces = provinces;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Set getProvinces() {
		return this.provinces;
	}

	public void setProvinces(Set provinces) {
		this.provinces = provinces;
	}

}
