package com.journaldev.spring.service;

import java.util.List;

import com.journaldev.spring.model.Project;

public interface ProjectService {

	public void addProject(Project p);

	public void updateProject(Project p);

	public List<Project> listProjects();

	public Project getProjectById(int id);

	public void removeProject(int id);

}