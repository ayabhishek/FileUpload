package com.uploadFile.UploadFile.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uploadFile.UploadFile.model.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {

}
