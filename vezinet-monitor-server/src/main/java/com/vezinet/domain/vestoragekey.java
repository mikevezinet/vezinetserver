package com.vezinet.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class vestoragekey implements Serializable {
	
	private int serverid;
	
	private String guid;

	

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public int getServerid() {
		return serverid;
	}

	public void setServerid(int serverid) {
		this.serverid = serverid;
	}
	
	

}
