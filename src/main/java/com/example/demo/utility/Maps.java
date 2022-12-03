package com.example.demo.utility;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * @author user
 *
 */
public class Maps {
	public static void main(String[] args) {
//		map1();
//		mapGroup();
//		navigableMap();
		
		
		
		int[] A = {-1, -3, 1, 1, 5, 6};
		int pos = missingInteger(A);
		System.out.println(pos);
	}
	
	public static int solution(int[] A) {
        // write your code in Java SE 8.max.get
		// 1. put to new array the positive values
		// 2. sort new array
		// 3. iterate new array check if next minus current is equal to 1
		List<Integer> integers = new ArrayList<>();
		for(int i = 0; i < A.length; i++) {
			if(A[i] > 0) {
				integers.add(A[i]);
			}
		}
		
		integers.sort(null);
		if(integers.isEmpty()) {
			return 1;
		}
		
		if(integers.get(0) != 1) {
			return 1;
		}
		
		for(int i = 0; i < integers.size(); i++) {
			
			if(i != integers.size() -1
					&& 1 != (integers.get(i + 1) - integers.get(i))) {
					return integers.get(i) + 1;
			}
			
		}
		
		return integers.get(integers.size()-1) + 1;
    }
	
	
	
	/**int
	 * @return the smallest positive number missing
	 */
	public static int getSmallestPositive(int[] A) {
		List<Integer> integers = Arrays.stream(A)
								.boxed()
								.distinct()
								.collect(Collectors.toList());
		integers.removeIf(n -> n < 0);
		integers.sort(null);
		
		if(integers.isEmpty()
				||integers.get(0) != 1 ) {
			return 1;
		}
		
		for(int i = 0; i < integers.size() - 1; i++) {
			if(1 != (integers.get(i + 1) - integers.get(i))) {
				return integers.get(i) + 1;
			}
		}
		
		return 1;
	}
	
	
	public static int missingInteger(int[] A) {
		HashSet<Integer> nums = new HashSet<>();
		for(int i = 1; i<A.length; i++) {
			nums.add(i);
		}
		
//		for(int a: A) {
//			nums.remove(new Integer(a));
//		}
		
		return nums.iterator().next();
	}
	
	public static void navigableMap() {
		NavigableMap<Integer, String> map = new TreeMap<>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");

		map.keySet().forEach(key -> System.out.print(key + " "));
		System.out.println();

		NavigableSet<Integer> descendingKeys = map.descendingKeySet();
		descendingKeys.forEach(key -> System.out.print(key + " "));
		
	}
	
	public static void sortedMap() {
		SortedMap<Integer, String> map = new TreeMap<>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(5, "five");
		map.put(6, "six");

		SortedMap<Integer, String> headMap = map.headMap(6);
		headMap.put(0, "zero"); // this line is ok
		headMap.put(4, "four"); // this line throws an IllegalArgumentException

	}
	
	public static void map1() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "one");
		map.put(2, "two");
		
		for(int value: map.keySet()) {
			System.out.println("map keys: "+value);
		}
				
	}
	
	public static void mapGroup() {
		List<String> strings = List.of("one", "two", "three", "four", "five", "six", "seven");
		Map<Integer, List<String>> map = new HashMap<>();
		for(String word: strings) {
			int length = word.length();
			if(!map.containsKey(length)) {
				map.put(length, new ArrayList<>());
			}

			map.get(length).add(word);
		}
		
		map.forEach((key, value) -> System.out.println(key + "::" + value));
	}
}
