package com.example.demo.utility;

public abstract class Animal {
	public String age;
	
	public String name;
	
	abstract void makeSound();
	
	void printName() {
		System.out.println("Hi I'm an animal");
	}
	
	private void printAge() {
		System.out.println("I am " + age + " years old");
	}
}
