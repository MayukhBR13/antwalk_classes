package com.map.many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Emp {
	@Id
	private int id;
	private String name;
	@ManyToMany
//	@JoinTable
//	(name="emp_project_relation",
//	joinColumns= {@JoinColumn(name="eid")},
//	inverseJoinColumns = {@JoinColumn(name="pid")})
	private List<Project> projects;
	public Emp(int id, String name, List<Project> projects) {
		super();
		this.id = id;
		this.name = name;
		this.projects = projects;
	}
	public Emp() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name +"]";
	}
	
}
