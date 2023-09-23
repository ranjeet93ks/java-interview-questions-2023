package com.interviews.questions.amdocs;

public class AmdocshackerrankInheritance extends Dog {

	public AmdocshackerrankInheritance() {
		super();
		System.out.println("AmdocshackerrankInheritance  constructor");
		//Dog -> constructors 
		//AmdocshackerrankInheritance  constructor
	}

	public void makeNoise() {
		super.makeNoise();
		System.out.println("AmdocshackerrankInheritance  make noise ...");
	}

	public static void main(String[] args) {
		Dog dog = new AmdocshackerrankInheritance();
		dog.makeNoise();
		// o/p
		// Dog make noise ...
		// AmdocshackerrankInheritance make noise ...
	}

}

abstract class Animal {
	public abstract void makeNoise();
}

abstract class Dog extends Animal {

	public Dog() {
		System.out.println("Dog -> constructors ");
	}

	public void makeNoise() {
		System.out.println("Dog make noise ...");
	}
}