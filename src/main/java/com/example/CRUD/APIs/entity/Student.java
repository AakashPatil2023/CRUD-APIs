package com.example.CRUD.APIs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id  
	private int rollno;
	private String name;
	private float percentage;
	private String branch;
	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int rollno, String name, float percentage, String branch) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.percentage = percentage;
		this.branch = branch;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", percentage=" + percentage + ", branch=" + branch
				+ "]";
	}
	
	

}
