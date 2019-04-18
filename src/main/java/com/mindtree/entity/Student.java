package com.mindtree.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Student {
	
	@Id
	private int sid;
	
	private String sname;
	
	private String location;
	
	public Student() {
		
	}

	public Student(int sid, String sname, String location) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.location = location;
	}

	public int getSid() {
		return sid;
	}

	public String getSname() {
		return sname;
	}

	public String getLocation() {
		return location;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}