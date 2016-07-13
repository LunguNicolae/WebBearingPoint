package com.bearingpoint.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "task")
public class Task {

	@Id
    @Column(name = "id")
    private Long id;
	
	@Column(name = "title")
	private String title;
	 
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "priority_id",nullable = true)
    private Priority priority;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "version_id",nullable = true)
    private Version version;
//	
//	@ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "project_id",nullable = true)
//    private Project project;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "statute_id",nullable = true)
    private Statute statute;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "description_id",nullable = true)
    private Description description;
	

	
	public Task() {
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public Priority getPriority() {
		return priority;
	}


	public void setPriority(Priority priority) {
		this.priority = priority;
	}


	public Version getVersion() {
		return version;
	}


	public void setVersion(Version version) {
		this.version = version;
	}


//	public Project getProject() {
//		return project;
//	}
//
//
//	public void setProject(Project project) {
//		this.project = project;
//	}


	public Statute getStatute() {
		return statute;
	}


	public void setStatute(Statute statute) {
		this.statute = statute;
	}


	public Description getDescription() {
		return description;
	}


	public void setDescription(Description description) {
		this.description = description;
	}


	

	
}
