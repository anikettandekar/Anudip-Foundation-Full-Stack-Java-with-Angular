package com.anudip.methodOverriding;
//Write a Java program to create a base class Animal with methods move() and makeSound(). Create two subclasses Bird and Panthera. Override the move() method in each subclass to describe how each animal moves. Also, override the makeSound() method in each subclass to make a specific sound for each animal.

class Animal {
	public void move() {
		System.out.println("Animals move");
	}

	public void makeSound() {
		System.out.println("Animals make sound");
	}
}

class Bird extends Animal {

	@Override
	public void move() {
		System.out.println("Birds fly");
	}

	@Override
	public void makeSound() {
		System.out.println("Birds chirps");
	}
}

class Panthera extends Animal {

	@Override
	public void move() {
		System.out.println("Panthera runs");
	}

	@Override
	public void makeSound() {
		System.out.println("Panthera roars");
	}
}

public class MainAnimals {
	public static void main(String[] args) {
		Animal animal1 = new Bird();
		Animal animal2 = new Panthera();

		Animal animal3 = new Animal();

		animal1.move();
		animal1.makeSound();

		animal2.move();
		animal2.makeSound();

		animal3.move();
		animal3.makeSound();
	}

}
