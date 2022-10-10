package com.vezinet.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "ve_task_history")
public class TaskHistory {

	@Id
	@GeneratedValue
	@Column(name = "task_history_id")
	private Integer taskHistoryId;

	@ManyToOne
	@JoinColumn(name = "automation_id")
	private automation automationId;

	@Column(name = "executed_output", nullable = true)
	private String executedOutput;

	@Column(name="automation_script")
	private String automationScript;

	@Column(name = "send_date")
	@CreationTimestamp
	private Date sendDate;

	@Column(name = "executed_date", nullable = true)
	private Date executedDate;
	
	private int aid;
	
	private int sid;

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getAutomationScript() {
		return automationScript;
	}

	public void setAutomationScript(String automationScript) {
		this.automationScript = automationScript;
	}

	public Integer getTaskHistoryId() {
		return taskHistoryId;
	}

	public void setTaskHistoryId(Integer taskHistoryId) {
		this.taskHistoryId = taskHistoryId;
	}

	public automation getAutomationId() {
		return automationId;
	}

	public void setAutomationId(automation automationId) {
		this.automationId = automationId;
	}

	public String getExecutedOutput() {
		return executedOutput;
	}

	public void setExecutedOutput(String executedOutput) {
		this.executedOutput = executedOutput;
	}

	public Date getSendDate() {
		return sendDate;
	}

	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}

	public Date getExecutedDate() {
		return executedDate;
	}

	public void setExecutedDate(Date executedDate) {
		this.executedDate = executedDate;
	}
	
	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public int getSid() {
		return sid;
	}

}
