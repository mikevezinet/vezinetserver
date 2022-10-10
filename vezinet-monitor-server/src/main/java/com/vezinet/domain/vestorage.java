package com.vezinet.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ve_storage")
public class vestorage {

	@Id
	private vestoragekey ve;

	private Integer inter, pid;

	@Column(nullable = true)
	private String data, value, state, type, sentdate, defaultvalue, cond;

	@Column(nullable = true)
	private String pvalue, sid, status;

	public vestoragekey getVe() {
		return ve;
	}

	public void setVe(vestoragekey ve) {
		this.ve = ve;
	}

	public Integer getInter() {
		return inter;
	}

	public void setInter(Integer inter) {
		this.inter = inter;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSentdate() {
		return sentdate;
	}

	public void setSentdate(String sentdate) {
		this.sentdate = sentdate;
	}

	public String getDefaultvalue() {
		return defaultvalue;
	}

	public void setDefaultvalue(String defaultvalue) {
		this.defaultvalue = defaultvalue;
	}

	public String getCond() {
		return cond;
	}

	public void setCond(String cond) {
		this.cond = cond;
	}

	public String getPvalue() {
		return pvalue;
	}

	public void setPvalue(String pvalue) {
		this.pvalue = pvalue;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
