package com.example.demo.utility;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.example.demo.entity.City;
import com.example.demo.entity.State;

/**
 * Adding Intermediate Operations on a Stream
 * 
 * @author Franque
 *
 */
public class MapStreamToStream {
	public static void main(String[] args) {
		List<String> strings = List.of("one", "two", "three", "four");
//		Function<String, Integer> toLength = String::length;
//		List<Integer> lengths = strings.stream()
//		                              .map(String::length)
//		                              .collect(Collectors.toList());
//		
//		System.out.println("lengths = " + lengths);
//		
//		intSummaryStatistics();
//		streamFilter();
//		flatMap();
//		validateMap();
		customCollector();
	}
	
	public static void intSummaryStatistics() {
		List<String> strings = List.of("one", "two", "three", "four");
		IntSummaryStatistics stats = strings.stream()
		                                    .mapToInt(String::length)
		                                    .summaryStatistics();
		System.out.println("stats = " + stats);

	}
	
	public static void streamFilter() {
		List<String> strings = List.of("one", "two", "three", "four");
		long count = strings.stream()
		                    .map(String::length)
		                    .filter(length -> length == 3)
		                    .count();
		System.out.println("count = " + count);

	}
	
	public static void flatMap() {
		
		City manilaCity = new City();
		manilaCity.setName("Manila City");
		manilaCity.setPopulation(100000);
		
		City caviteCity = new City();
		caviteCity.setName("Cavite City");
		caviteCity.setPopulation(200000);
		
		List<City> cities = new ArrayList<>();
		cities.add(caviteCity);
		cities.add(manilaCity);
		
		State philippines = new State();
		philippines.setName("Philippines");
		philippines.setCities(cities);
		
		List<State> states = new ArrayList<>();
		states.add(philippines);
		
		int totalPopulation = 0;
		for (State state: states) {
//		    for (City city: state.getCities()) {
//		        totalPopulation += city.getPopulation();
//		    }
			
			totalPopulation += state.getCities().stream().mapToInt(City::getPopulation).sum();
			
		}

		System.out.println("Total population = " + totalPopulation);

		
		Function<State, Stream<City>> stateToCity = state -> state.getCities().stream();
		System.out.println("stateToCity = " + stateToCity);
		
		int totalPopulation1 = 
		        states.stream()
		              .flatMap(stateToCity)
		              .mapToInt(City::getPopulation)
		              .sum();

		System.out.println("Total population = " + totalPopulation1);

	}
	
	
	public static void validateMap() {
//		Function<String, Stream<Integer>> flatParser = s -> {
//		    try {
//		        return Stream.of(Integer.parseInt(s));
//		    } catch (NumberFormatException e) {
//		    }
//		    return Stream.empty();
//		};
//
		List<String> strings = List.of("1", " ", "2", "3 ", "", "3");
//		List<Integer> ints = 
//		    strings.stream()
//		           .flatMap(flatParser)
//		           .collect(Collectors.toList());
//		
//		System.out.printiimplpln("ints = " + ints);
		
		List<Integer> ints =
		        strings.stream()
		               .<Integer>mapMulti((string, consumer) -> {
		                    try {
		                        consumer.accept(Integer.parseInt(string));
		                    } catch (NumberFormatException ignored) {
		                    }
		               })
		               .collect(Collectors.toList());
		System.out.println("ints = " + ints);


	}
	
	public static void customCollector() {
		LinkedList<Integer> linkedList =
				IntStream.range(0, 10)
				         .boxed()
				         .collect(Collectors.toCollection(LinkedList::new));
				System.out.println("linked listS = " + linkedList);

	}
}
