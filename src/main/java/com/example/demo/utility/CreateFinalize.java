package com.example.demo.utility;

public class CreateFinalize {
	public static void main(String[] args) {
		CreateFinalize createFinalize = new CreateFinalize();
		createFinalize = null;
		
       System.gc();     
       System.out.println("End of the garbage collection");   
	}
	
   protected void finalize()     
   {     
       System.out.println("Called the finalize() method");     
   } 
}
