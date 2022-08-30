package com.example.demo.service;

import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.example.demo.dto.StudentData;
import com.example.demo.entity.Students;
import com.example.demo.exception.StudentException;

public interface StudentService {
	public ResponseEntity<String> saveStudent(Students students) throws StudentException;
	public Optional<Students> getStudentById(Long id);
	public StudentData getAllStudents();
}
