package com.example.demo.utility;

public class Dog extends Animal{

	@Override
	void makeSound() {
		System.out.println("woof woof");
	}

	@Override
	void printName() {
		super.printName();
		System.out.println("Hi I'm a dog");
	}
}
