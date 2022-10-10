package com.vezinet.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="ve_server")
public class veserver {
	
	@Id
	@GeneratedValue
	private int serverid;
	

	@Column(nullable=true)
	private int delivery,sent,userid,duration;
	
	@Column(nullable=true)
	private String emailsent,status,clientpass,clientname,ofserverpass,ofservername,serveraddr,serverdesc;
	
	@Column(nullable=true)
	private String updatedby,userref1,userref2,userref3,userref4,userref5,log;
	
	@Column(nullable=true)
	private Date lastupdated;
	
	
	
	
	
	public String getLog() {
		return log;
	}
	public void setLog(String log) {
		this.log = log;
	}
	public String getUpdatedby() {
		return updatedby;
	}
	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}
	public String getUserref1() {
		return userref1;
	}
	public void setUserref1(String userref1) {
		this.userref1 = userref1;
	}
	public String getUserref2() {
		return userref2;
	}
	public void setUserref2(String userref2) {
		this.userref2 = userref2;
	}
	public String getUserref3() {
		return userref3;
	}
	public void setUserref3(String userref3) {
		this.userref3 = userref3;
	}
	public String getUserref4() {
		return userref4;
	}
	public void setUserref4(String userref4) {
		this.userref4 = userref4;
	}
	public Date getLastupdated() {
		return lastupdated;
	}
	public void setLastupdated(Date lastupdated) {
		this.lastupdated = lastupdated;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getServerid() {
		return serverid;
	}
	public void setServerid(int serverid) {
		this.serverid = serverid;
	}
	
	
	public int getDelivery() {
		return delivery;
	}
	public void setDelivery(int delivery) {
		this.delivery = delivery;
	}
	public int getSent() {
		return sent;
	}
	public void setSent(int sent) {
		this.sent = sent;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getEmailsent() {
		return emailsent;
	}
	public void setEmailsent(String emailsent) {
		this.emailsent = emailsent;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getClientpass() {
		return clientpass;
	}
	public void setClientpass(String clientpass) {
		this.clientpass = clientpass;
	}
	public String getClientname() {
		return clientname;
	}
	public void setClientname(String clientname) {
		this.clientname = clientname;
	}
	public String getOfserverpass() {
		return ofserverpass;
	}
	public void setOfserverpass(String ofserverpass) {
		this.ofserverpass = ofserverpass;
	}
	public String getOfservername() {
		return ofservername;
	}
	public void setOfservername(String ofservername) {
		this.ofservername = ofservername;
	}
	public String getServeraddr() {
		return serveraddr;
	}
	public void setServeraddr(String serveraddr) {
		this.serveraddr = serveraddr;
	}
	public String getServerdesc() {
		return serverdesc;
	}
	public void setServerdesc(String serverdesc) {
		this.serverdesc = serverdesc;
	}

	
	
}
