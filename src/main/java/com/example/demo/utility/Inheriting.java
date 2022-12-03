package com.example.demo.utility;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.example.demo.dto.StudentData;
import com.example.demo.entity.City;
import com.example.demo.entity.Students;
import com.example.demo.exception.StudentException;
import com.example.demo.exception.response.StudentAlreadyRegistered;
import com.example.demo.service.CityService;
import com.example.demo.service.StudentService;

public class Inheriting extends Dog implements CityService, StudentService{
	
	public static void main(String[] args) {
		new Inheriting().makeSound();
		
		Animal obj = new Dog();
		
	}
	
	
	@Override
	public ResponseEntity<StudentAlreadyRegistered> saveStudent(Students students) throws StudentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Students> getStudentById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public StudentData getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<City> findCities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getPopulation() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	void makeSound() {
		name = "Franque";
		age = "28";
		printName();
		
		System.out.println("wrraaaaaarr");
	}


}
