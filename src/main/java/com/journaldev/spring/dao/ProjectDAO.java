package com.journaldev.spring.dao;

import com.journaldev.spring.model.Project;

import java.util.List;

public interface ProjectDAO {

	public void addProject(Project p);

	public void updateProject(Project p);

	public List<Project> listProjects();

	public Project getProjectById(int id);

	public void removeProject(int id);

}
