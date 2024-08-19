package com.uploadFile.UploadFile.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "STUDENT_UPLOAD")

public class Student {

	@Id
	@GeneratedValue
	int enrollmentNo;
	int rollNo;
	String name;
}
