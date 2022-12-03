package com.example.demo.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaExpressions {
	public static void main(String[] args) {
		LambdaExpressions expressions = new LambdaExpressions();
		
//		List<String> strings = new ArrayList<>();
//		strings.add("eqe");
//		expressions.retainStringsOfLength3(strings);
		long num = 1238098192039123l;
		expressions.mobileNumber(945811);
		
	}
	
	public void consumer() {
		Consumer<String> consumer = s-> System.out.println(s);
		System.out.println(consumer);
	}
	
	List<String> retainStringsOfLength3(List<String> strings) {

	    Predicate<String> predicate = s -> s.length() == 3;
	    List<String> stringsOfLength3 = new ArrayList<>();
	    for (String s: strings) {
	        if (predicate.test(s)) {
	            stringsOfLength3.add(s);
	        }
	    }
	    
	    System.out.println(stringsOfLength3);
	    return stringsOfLength3;
	}
	
	public void runnable() {
		Runnable runnable = () -> System.out.println("I am running....");
	}
	
	public void mobileNumber(int mobNumber) {
		MobileCountPredicate<Integer> mobileCountPredicate = i -> Integer.SIZE == 5;
		if( !mobileCountPredicate.test(mobNumber)) {
			System.out.println("Invalid mobile number");
		}
		
	}
}
