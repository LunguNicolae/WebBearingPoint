package com.bearingpoint.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "project")
public class Project {

	@Id
    @Column(name = "id")
    private Long id;
	
	@Column(name = "name_project")
    private String nameProject;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "person_id",nullable = true)
    private Person projectManager;
	
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "version_id",nullable = true)
    private Version version;
	
	public Project(){	
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameProject() {
		return nameProject;
	}

	public void setNameProject(String nameProject) {
		this.nameProject = nameProject;
	}

	public Person getProjectManager() {
		return projectManager;
	}

	public void setProjectManager(Person projectManager) {
		this.projectManager = projectManager;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", nameProject=" + nameProject + ", projectManager=" + projectManager + "]";
	}
	
	
	
	
}
