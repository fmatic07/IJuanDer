package com.example.demo.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StudentServiceImplTest {

	@Autowired
	private StudentServiceImpl serviceImpl;

	@Test
	public void testGetAllStudents() {
		
		assertEquals(2, serviceImpl.getAllStudents());
	}

}
