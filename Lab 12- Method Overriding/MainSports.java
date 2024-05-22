package com.anudip.methodOverriding;

//Write a Java program to create a base class Sports with a method called play(). Create three subclasses: Football, Basketball, and Rugby. Override the play() method in each subclass to play a specific statement for each sport.



class Sports {
 public void play() {
     System.out.println("Playing sports");
 }
}

class Football extends Sports {
 @Override
 public void play() {
     System.out.println("Playing Football");
 }
}

class Basketball extends Sports {
 @Override
 public void play() {
     System.out.println("Playing Basketball");
 }
}

class Rugby extends Sports {
 @Override
 public void play() {
     System.out.println("Playing Rugby");
 }
}


public class MainSports {
 public static void main(String[] args) {

     Sports football = new Football();
     Sports basketball = new Basketball();
     Sports rugby = new Rugby();


     football.play();     
     basketball.play() ;
     rugby.play();       
 }
}
