package com.vezinet.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class automation {

	@Id
	@GeneratedValue
	private int aid;

	private String aname, adesc, status;

	private int sid;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "automationId")
	private java.util.List<TaskHistory> taskHistoryTable;

	public java.util.List<TaskHistory> getTaskHistoryTable() {
		return taskHistoryTable;
	}

	public void setTaskHistoryTable(java.util.List<TaskHistory> taskHistoryTable) {
		this.taskHistoryTable = taskHistoryTable;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getAdesc() {
		return adesc;
	}

	public void setAdesc(String adesc) {
		this.adesc = adesc;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
