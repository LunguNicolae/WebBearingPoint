package com.bearingpoint.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
    @JoinColumn(name = "affect_version_id",nullable = true)
    private AffectVersion affectVersion;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "project_id",nullable = true)
    private Project project;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "statute_id",nullable = true)
    private Statute statute;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "description_id",nullable = true)
    private Description description;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fix_version_id",nullable = true)
    private FixVersion fixVersion;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "creator_of_task_id",nullable = true)
    private CreatorOfTask creatorOfTask;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "designer_of_task_id",nullable = true)
    private DesignerOfTask designerOfTask;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "implementor_of_task_id",nullable = true)
    private ImplementorOfTask implementorOfTask;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "tester_of_task_id",nullable = true)
    private TesterOfTask testerOfTask;
	
	public Task() {
	}
	
	public Task(String title){
		this.title=title;
	}
	
	public Task(Long id, String title, Priority priority, AffectVersion affectVersion, Project project, Statute statute, Description description, FixVersion fixVersion, CreatorOfTask creatorOfTask, DesignerOfTask designerOfTask, ImplementorOfTask implementorOfTask,TesterOfTask testerOfTask) {
        this.id = id;
        this.title=title;
        this.priority = priority;
        this.affectVersion = affectVersion;
        this.project = project;
        this.statute = statute;
        this.description = description;
        this.fixVersion = fixVersion;
        this.creatorOfTask = creatorOfTask;
        this.designerOfTask = designerOfTask;
        this.implementorOfTask = implementorOfTask;
        this.testerOfTask = testerOfTask;
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

    public void setPriority(Priority priority){
    	this.priority = priority;
    }
    
    
    public AffectVersion getAffectVersion() {
        return affectVersion;
    }

    public void setAffectVersion(AffectVersion affectVersion){
    	this.affectVersion = affectVersion;
    }
   
    
    public Project getProject() {
        return project;
    }

    public void setProject(Project project){
    	this.project = project;
    }
    
    
    public Statute getStatute() {
        return statute;
    }

    public void setStatute(Statute statute){
    	this.statute = statute;
    }
    
    
    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description){
    	this.description = description;
    }
    
    
    public FixVersion getFixVersion() {
        return fixVersion;
    }

    public void setFixVersion(FixVersion FixVersion){
    	this.fixtVersion = fixVersion;
    }
    
    
    public CreatorOfTask getCreatorOfTask() {
        return CreatorOfTask;
    }

    public void setCreatorOfTask(CreatorOfTask creatorOfTask){
    	this.creatorOfTask = creatorOfTask;
    }
    
    
    public DesignerOfTask getDesignerOfTask() {
        return DesignerOfTask;
    }

    public void setDesignerOfTask(DesignerOfTask designerOfTask){
    	this.designerOfTask = designerOfTask;
    }
    
    
    public ImplementorOfTask getImplementorOfTask() {
        return implementorOfTask;
    }

    public void setImplementorOfTask(ImplementorOfTask implementorOfTask){
    	this.implementorOfTask = implementorOfTask;
    }
    
    
    public TesterOfTask getTesterOfTask() {
        return testerOfTask;
    }

    public void setTesterOfTask(TesterOfTask testerOfTask){
    	this.testerOfTask = testerOfTask;
    }
    
    @Override
    public String toString() {
        return "User{" + "id=" + id + ", title=" + title + ", priority=" + priority + ", affectVersion=" + affectVersion + ", project=" + project + ", statute=" + statute + ", description=" + description + ", fixVersion=" + fixVersion + ", creatorOfTask=" + creatorOfTask + ", designerOfTask=" + designerOfTask + ", implementorOfTask=" + implementorOfTask + ", testerOfTask=" + testerOfTask +'}';
    }
}
