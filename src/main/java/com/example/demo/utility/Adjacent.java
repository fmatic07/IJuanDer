package com.example.demo.utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Adjacent {
	public static void main(String[] args) {

		Map<String, Integer> client = new HashMap<>();
		
		client.put("Clint 1", 10);
		client.put("Clint 2", 20);
		client.put("Clint 3", 30);
		client.put("Clint 4", 40);
		
		System.out.println(client.entrySet());
		
		
	}
}
