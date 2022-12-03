package com.example.demo.utility;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

public class OddOccurances {
    public int solution(int[] A) {
        Set<Integer> nums = new HashSet<>();
        
        for(int i=0; i<A.length; i++) {
        	if( nums.contains(A[i])) {
        		nums.remove(A[i]);
        	}else {
        		nums.add(A[i]);
        	}
        }
        return nums.iterator().next();
    }
    
    public static void main(String[] args) {
    	OddOccurances occurances = new OddOccurances();
    	int unpaired = occurances.solution(new int[] {9,3,9,3,9,7,9});
//    	System.out.println(unpaired);
    	
    	
// !   	Collection col = new Collection<>(); cannot be instantiated
    	Collection collectionHashSet = new HashSet<>();
    	Collection collectionArrayList = new ArrayList<>();
    	
    	List<String> list = new ArrayList<>(); 
    	LinkedList<Integer> ints = new LinkedList<>(); 
    	Vector<String> vecs = new Vector<>();
    	Stack<String> stacks = new Stack<>();
    	
    	
//    	occurances = null;
//    	
//    	System.gc();
//    	System.out.println("Terminating");
    	
    	
    	
    	switchElement(10, 5);
    	
	}
    
    protected void finalize() {
		System.out.println("Just call me");
	}
    
    private static void switchElement(int a, int b) {
    	// a  = 15;
    	// b = 9;
    	
    	a += b;   // 24
    	
    	b = a - b; // 24 - 9
    	
    	a = a - b; // 24 - 15
    	
    	
    	System.out.println(a);
    	System.out.println(b);
    }
}
