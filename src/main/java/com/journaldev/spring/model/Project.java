package com.journaldev.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "project_list")
public class Project {

	@Id
	@Column(name = "project_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int projectId;

	private String projectName;

	private String projectDescription;

	private int estimatedCost;

	private String startDate;

	private String estimatedCompletionDate;

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	public int getEstimatedCost() {
		return estimatedCost;
	}

	public void setEstimatedCost(int estimatedCost) {
		this.estimatedCost = estimatedCost;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEstimatedCompletionDate() {
		return estimatedCompletionDate;
	}

	public void setEstimatedCompletionDate(String estimatedCompletionDate) {
		this.estimatedCompletionDate = estimatedCompletionDate;
	}

	@Override
	public String toString() {
		return "project_id=" + projectId + ", project_name=" + projectName + ", project_description="
				+ projectDescription + ", estimated_cost=" + estimatedCost + ", start_date=" + startDate
				+ ", estimated_completion_date=" + estimatedCompletionDate;
	}
}
