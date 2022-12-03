package com.example.demo.utility;

public class TapeEquilibrium {
    public int solution(int[] A) {
    	
    	int totalOnLeft = 0;
    	
    	for(int i=0; i<A.length; i++) {
    		totalOnLeft += A[i];
    	}
    	
    	int minimumDifference = Integer.MAX_VALUE;
    	int totalOnRight = 0;
    	for(int i=0; i<A.length-1; i++) {

    		totalOnLeft -= A[i];
    		totalOnRight += A[i];
    		
    		if(Math.abs(totalOnLeft - totalOnRight) < minimumDifference) {
    			minimumDifference = Math.abs(totalOnLeft - totalOnRight);
    		}
    	}
    	
    	
    	return minimumDifference;
    }
    
    public static void main(String[] args) {
    	System.out.println(new TapeEquilibrium().solution(new int[] {3,3,3,4,3})); 
    	System.out.println(new TapeEquilibrium().solution(new int[] { 0,1000,0,0,0 })); 
		
	}
}
