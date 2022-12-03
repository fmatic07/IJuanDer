package com.example.demo.utility;

import java.util.HashSet;
import java.util.Set;

public class FindTheMissingNumber {
    

	public int solution(int[] A) {
        // write your code in Java SE 8
		Set<Integer> set = new HashSet<>();
		
		for(int i=1; i<=A.length+1; i++) {
			set.add(i);
		}
		
		for(int i=0; i<A.length; i++) {
			set.remove((Integer)A[i]);
		}
		
    	return set.iterator().next();
    }
    
    public static void main(String[] args) {
		System.out.println(new FindTheMissingNumber().solution(new int[] {}));
		System.out.println(new FindTheMissingNumber().solution(new int[] {2,1,5,4}));
	}
    
    private void doSomething() {
    	System.out.println("hey jude");
    }
}
