package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dto.StudentData;
import com.example.demo.entity.Students;
import com.example.demo.exception.StudentException;
import com.example.demo.exception.response.StudentAlreadyRegistered;
import com.example.demo.repository.StudentsRepository;
import com.example.demo.service.StudentService;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentsRepository studentsRepository;

	public Optional<Students> getStudentById(Long id) {
		return studentsRepository.findById(id);
	}
	
	

	@Override
	public StudentData getAllStudents() {
		List<Students> students = new ArrayList<>();
		StudentData studentData = new StudentData();

		students = studentsRepository.findAll();

		studentData.setStudents(students);
		return studentData;
	}

	@Override
	public ResponseEntity<StudentAlreadyRegistered> saveStudent(Students students) throws StudentException {
		Students existingStudents = studentsRepository.findByName(students.getName());
		if( existingStudents == null ) {
			return new ResponseEntity<StudentAlreadyRegistered>(
					new StudentAlreadyRegistered(HttpStatus.BAD_REQUEST.value(), "Student already registered"), HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity<StudentAlreadyRegistered>(
				new StudentAlreadyRegistered(HttpStatus.OK.value(), "Student successfully registered"), HttpStatus.OK);
	}

}
