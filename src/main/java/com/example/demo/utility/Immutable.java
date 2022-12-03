package com.example.demo.utility;

public final class Immutable {
	private final int age;
	private final String name;
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public Immutable(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	public void printDetails() {
		System.out.println("Hi I`m " + this.name + " and I'm " + this.age);
	}
	public static void main(String[] args) {
		Immutable immutable = new Immutable(28, "Franque");		
		immutable.printDetails();
		
		System.gc();
	}
	
	protected void finalize() {
		System.out.println("Called the finalize method");
	}
}
