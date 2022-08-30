package com.example.demo.controller;

import javax.annotation.Resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.StudentData;
import com.example.demo.entity.Students;
import com.example.demo.exception.StudentException;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentsController {
	
	@Resource(name = "studentService")
	private StudentService studentService;
	
	@GetMapping
	public StudentData getStudents(){
		return studentService.getAllStudents();
	}
	
	
	@PostMapping("/save")
	public ResponseEntity<String> saveStudent(final @RequestBody Students students) throws StudentException { 
		return studentService.saveStudent(students);
	}

}
