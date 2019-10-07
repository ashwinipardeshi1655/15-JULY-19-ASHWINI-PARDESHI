package com.ust.taskmanagement.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "task_info")
public class Task {

	@Id
	@Column
	@GeneratedValue
	private int taskId;

	@Column(nullable = false)
	private String taskName;

	@GeneratedValue
	@Column
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date startDate;

	@Column
	// @GeneratedValue
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date endDate;

	// getters and setters
	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
