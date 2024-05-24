package com.anudip.methodOverriding;

//Base class
class Vehicle {
 public void startEngine() {
     System.out.println("Starting the vehicle's engine");
 }

 public void stopEngine() {
     System.out.println("Stopping the vehicle's engine");
 }
}

//Subclass Car
class Car extends Vehicle {
 @Override
 public void startEngine() {
     System.out.println("Starting the car's");
 }

 @Override
 public void stopEngine() {
     System.out.println("Stopping the car's engine");
 }
}

//Subclass Motorcycle
class Motorcycle extends Vehicle {
 @Override
 public void startEngine() {
     System.out.println("Starting the motorcycle's engine");
 }

 @Override
 public void stopEngine() {
     System.out.println("Stopping the motorcycle's engine");
 }
}

//Main class to test the functionality
public class MainVehicle {
 public static void main(String[] args) {
	 Vehicle myVehicle = new Vehicle();
     Vehicle myCar = new Car();
     Vehicle myMotorcycle = new Motorcycle();

     myVehicle.startEngine();
     myVehicle.stopEngine();
     myCar.startEngine();
     myCar.stopEngine();

     myMotorcycle.startEngine();
     myMotorcycle.stopEngine();
 }
}
