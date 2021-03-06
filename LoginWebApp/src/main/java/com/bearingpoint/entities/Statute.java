package com.bearingpoint.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "statute")
public class Statute {

	@Id
	@Column(name ="id")
	private Long id;
	
	@Column(name ="type")
	private String type;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Statute [id=" + id + ", type=" + type + "]";
	}
	
	
	
}
