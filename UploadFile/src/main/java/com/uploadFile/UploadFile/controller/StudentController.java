package com.uploadFile.UploadFile.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.uploadFile.UploadFile.service.StudentService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1.students")
@RequiredArgsConstructor
public class StudentController {
	@Autowired
	private StudentService service;
	
	@PostMapping(value="/upload",consumes= {"multipart/form-data"})
	public ResponseEntity<Integer> uploadStudents(@RequestPart("file")MultipartFile file) throws IOException{
		return ResponseEntity.ok(service.uploadStudents(file));
	}

}
