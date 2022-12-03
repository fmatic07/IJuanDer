package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.City;
import com.example.demo.service.CityService;

@RestController
@RequestMapping("/city")
public class CityController {

	@Autowired
	private CityService cityService;
	
	@GetMapping()
	public List<City> getAllCities() {
		List<City> cityResponse = cityService.findCities();
		return cityResponse;
	}
	
	@GetMapping("/population")
	public int getTotalPopulation() {
		return cityService.getPopulation();
	}
}
