package com.example.demo.utility;

public class MinimalJumps {
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8    	
    	int distance = Y - X;
    	int jumps = (int) Math.ceil(distance/(double)D);
    	return jumps;
    }
    
    public static void main(String[] args) {
    	MinimalJumps minimalJumps = new MinimalJumps();
    	System.out.println( minimalJumps.solution(10, 80, 30) );
    	System.out.println( minimalJumps.solution(10, 10, 1) );
    	
	}
}
