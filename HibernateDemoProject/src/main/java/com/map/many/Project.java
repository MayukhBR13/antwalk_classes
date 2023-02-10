package com.map.many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	private int pid;
	private String projectName; 
	@ManyToMany
	private List<Emp> employees;
	@Override
	public String toString() {
		return "Project [pid=" + pid + ", projectName=" + projectName+"]";
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public List<Emp> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Emp> employees) {
		this.employees = employees;
	}
	public Project() {
		super();
	}
	public Project(int pid, String projectName, List<Emp> employees) {
		super();
		this.pid = pid;
		this.projectName = projectName;
		this.employees = employees;
	}
}
