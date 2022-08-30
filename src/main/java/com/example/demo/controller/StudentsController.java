package com.example.demo.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.StudentData;
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

}
