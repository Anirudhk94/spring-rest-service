package com.mk.matchkey;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MatchKey {
	@Id
	@GeneratedValue
	private Integer id;
	@Column
	private Integer mk_id;
	@Column
	private String name;
	@Column
	private String description;
	@Column
	private String validity;
	
	public MatchKey(int mk_id, String name, String description, String validity) {
		this.mk_id = mk_id;
		this.name = name;
		this.description = description;
		this.validity = validity;
	}
	
	public MatchKey() {
		super();
	}

	public int getMk_id() {
		return mk_id;
	}
	public void setMk_id(int mk_id) {
		this.mk_id = mk_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getValidity() {
		return validity;
	}
	public void setValidity(String validity) {
		this.validity = validity;
	}

}
