package com.uploadFile.UploadFile.model;

import com.opencsv.bean.CsvBindByName;

import lombok.Builder;


@Builder
public class StudentCsvRepresentation {

	@CsvBindByName(column="firstname")
	private String fname;
	@CsvBindByName(column="lastname")
	private String lname;
	@CsvBindByName(column="age")
	private int age;
	public StudentCsvRepresentation(String fname, String lname, int age) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}
	public StudentCsvRepresentation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "StudentCsvRepresentation [fname=" + fname + ", lname=" + lname + ", age=" + age + "]";
	}
	
	
	
	
}
