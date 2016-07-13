package com.bearingpoint.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "version")
public class Version {


	@Id
    @Column(name = "id")
    private Long id;	
	
	@Column(name = "release")
    private String release;
	
//	@Column(name = "version")
//    private String version;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRelease() {
		return release;
	}

	public void setRelease(String release) {
		this.release = release;
	}

//	public String getVersion() {
//		return version;
//	}
//
//	public void setVersion(String version) {
//		this.version = version;
//	}
//
//	@Override
//	public String toString() {
//		return "Version [id=" + id + ", release=" + release + ", version=" + version + "]";
//	}
	
	
	
}
