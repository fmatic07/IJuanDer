package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.StudentData;
import com.example.demo.entity.Students;
import com.example.demo.repository.StudentsRepository;
import com.example.demo.service.StudentService;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentsRepository studentsRepository;

	@Override
	public Students getStudentById(String id) {
		studentsRepository.findById(null);
		return null;
	}

	@Override
	public StudentData getAllStudents() {
		List<Students> students = new ArrayList<>();
		StudentData studentData = new StudentData();

		students = studentsRepository.findAll();

		studentData.setStudents(students);
		return studentData;
	}

}
