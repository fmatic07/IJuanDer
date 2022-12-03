package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.City;

public interface CityService {
	List<City> findCities();
	int getPopulation();
}
