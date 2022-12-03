package com.example.demo.service.impl;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.City;
import com.example.demo.repository.CityRepository;
import com.example.demo.service.CityService;


@Service("cityService")
public class CityServiceImpl implements CityService{

	@Autowired
	private CityRepository cityRepository;
	
	@Override
	public List<City> findCities() {
		return cityRepository.findAll();
	}

	@Override
	public int getPopulation() {
		List<City> cities = cityRepository.findAll();
		
		Stream<City> streamCity = cities.stream();
		int totalPopulation = streamCity
				.mapToInt(city -> city.getPopulation())
				.filter(population -> population < 100001)
				.sum();
		return totalPopulation;
	}

}
