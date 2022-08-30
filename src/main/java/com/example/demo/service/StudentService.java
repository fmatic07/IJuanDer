package com.example.demo.service;

import com.example.demo.dto.StudentData;
import com.example.demo.entity.Students;

public interface StudentService {
	public Students getStudentById(String id);

	public StudentData getAllStudents();
}
