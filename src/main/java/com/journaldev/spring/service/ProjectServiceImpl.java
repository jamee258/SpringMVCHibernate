package com.journaldev.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.journaldev.spring.dao.ProjectDAO;
import com.journaldev.spring.model.Project;

@Service
public class ProjectServiceImpl implements ProjectService {

	private ProjectDAO projectDAO;

	public void setProjectDAO(ProjectDAO projectDAO) {
		this.projectDAO = projectDAO;
	}

	@Override
	@Transactional
	public void addProject(Project p) {
		this.projectDAO.addProject(p);
	}

	@Override
	@Transactional
	public void updateProject(Project p) {
		this.projectDAO.updateProject(p);
	}

	@Override
	@Transactional
	public List<Project> listProjects() {
		return this.projectDAO.listProjects();
	}

	@Override
	@Transactional
	public Project getProjectById(int id) {
		return this.projectDAO.getProjectById(id);
	}

	@Override
	@Transactional
	public void removeProject(int id) {
		this.projectDAO.removeProject(id);
	}

}