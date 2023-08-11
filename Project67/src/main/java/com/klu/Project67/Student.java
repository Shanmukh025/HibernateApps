package com.klu.Project67;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student
{
	@Id
	private long id;
	private String name;
	private int gpa;
	private double dob;
	
	public Student(){}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getgpa() {
		return gpa;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gpa=" + gpa + ", dob=" + dob + "]";
	}
	public void setgpa(int gpa) {
		this.gpa = gpa;
	}
	public double getdob() {
		return dob;
	}
	public Student(long id, String name, int gpa, double dob) {
		super();
		this.id = id;
		this.name = name;
		this.gpa = gpa;
		this.dob = dob;
	}
	public void setdob(double dob) {
		this.dob = dob;
	}
}