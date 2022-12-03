package com.example.demo.utility;

import java.util.HashSet;
import java.util.Set;

public class FindFrog {

	public static void main(String[] args) {
		FindFrog findFrog = new FindFrog();
		int jumps = findFrog.solution(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
		System.out.println(jumps);
		
	}

	public int solution(int[] A) {
		Set<Integer> fiboancci = new HashSet<Integer>();

		int firstNumber = 0;
		int secondNumber = 1;
		int sum = 0;

		for (int i = 0; i < A.length; i++) {
			fiboancci.add(firstNumber);
			sum = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = sum;
		}
		
		int jumps = 0;
		int currentPos = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == 1 
					&& fiboancci.contains((i-currentPos)+1)) {
				jumps++;
				currentPos = i;
			}
		}
		
		if( jumps == 0 ) {
			return -1;
		}
		
		jumps++;

		return jumps;
	}

}
